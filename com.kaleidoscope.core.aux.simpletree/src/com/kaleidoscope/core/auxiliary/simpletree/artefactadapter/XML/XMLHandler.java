package com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML;


import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import SimpleTree.Node;
import SimpleTree.SimpleTreeFactory;
import SimpleTree.Text;

/**
 * SAX parse Handler that builds an LabelledGraph while parsing a XML file.
 * 
 * @author David Marx
 * @author (last editor) $Author$
 * @version $Revision$ $Date$
 */
public class XMLHandler extends DefaultHandler {
	// Root node of the LabelledGraph
	private Node root;

	private boolean ignoreWhitespaces = true;

	// Stack used during construction
	private Stack<Node> nodes = new Stack<Node>();

	public boolean isIgnoreWhitespaces() {
		return ignoreWhitespaces;
	}

	public void setIgnoreWhitespaces(boolean ignoreWhitespaces) {
		this.ignoreWhitespaces = ignoreWhitespaces;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		// Start element, create node and set tag of this element as label
		Node node = SimpleTreeFactory.eINSTANCE.createNode();
		node.setName(qName);

		// For each attribute, create a corresponding instance of
		// LabelledGraphlanguage.Attribute
		for (int i = 0; i < attributes.getLength(); i++) {
			SimpleTree.Attribute attribute = SimpleTreeFactory.eINSTANCE.createAttribute();
			attribute.setName(attributes.getLocalName(i));
			attribute.setValue(attributes.getValue(i));
			attribute.setIndex(node.getAttribute().size());
			node.getAttribute().add(attribute);
		}

		// Set this node as root if it is the first created node
		if (root == null)
			root = node;

		// Add this node to the previously created node at the top of the stack
		if (!nodes.empty()) {
			addChildNode(node, nodes.peek());
		}

		// Push this node onto the top of the stack
		nodes.push(node);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// Processing this node is finished, remove from stack
		nodes.pop();
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String text = createText(ch, start, length);
		if (createTextNode(text)) {
			Text textNode = SimpleTreeFactory.eINSTANCE.createText();
			textNode.setName(text);
			addChildNode(textNode, nodes.peek());
		}
	}

	/**
	 * Decides if a a text node is created from the given string
	 * 
	 * @param text
	 * @return
	 */
	private boolean createTextNode(String text) {
		// if space characters are ignored, check if string is not empty
		if (ignoreWhitespaces) {
			text = text.trim();
		}
		// if space characters are not ignored, just check if there are characters
		return text.length() > 0;
	}

	private void addChildNode(Text child, Node parent) {
		child.setIndex(parent.getChildren().size());
		nodes.peek().getChildren().add(child);
	}

	private String createText(char[] ch, int start, int length) {
		String result = new String(ch, start, length);
		return result;
	}

	public Node getRoot() {
		return root;
	}

	// invoked when document-parsing is started:
	public void startDocument() throws SAXException {
		System.out.println("Document processing started");
	}

	// notifies about finish of parsing:
	public void endDocument() throws SAXException {
		System.out.println("Document processing finished");
	}

}