package com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML;

import SimpleTree.Attribute;
import SimpleTree.Node;
import SimpleTree.SimpleTreePackage;
import SimpleTree.Text;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenerateXML {
  public String readXMIFile(final String file, final String header) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    resourceSet.getPackageRegistry().put(SimpleTreePackage.eNS_URI, SimpleTreePackage.eINSTANCE);
    final Resource resource = resourceSet.getResource(URI.createURI(file), true);
    EList<EObject> _contents = resource.getContents();
    for (final EObject content : _contents) {
      {
        String _generateCode = this.generateCode(((Node) content));
        final String code = (header + _generateCode);
        return code;
      }
    }
    return null;
  }
  
  public String generateCode(final Node node) {
    StringConcatenation _builder = new StringConcatenation();
    int _size = node.getChildren().size();
    final boolean hasChild = (_size > 0);
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _name = node.getName();
    _builder.append(_name);
    String _generateAttributes = this.generateAttributes(node);
    _builder.append(_generateAttributes);
    String _xifexpression = null;
    if (hasChild) {
      _xifexpression = "";
    } else {
      _xifexpression = "/";
    }
    _builder.append(_xifexpression);
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      if (hasChild) {
        {
          EList<Text> _children = node.getChildren();
          for(final Text child : _children) {
            _builder.append("\t");
            String _generateCode = this.generateCode(((Node) child));
            _builder.append(_generateCode, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</");
        String _name_1 = node.getName();
        _builder.append(_name_1);
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateAttributes(final Node node) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Attribute> _attribute = node.getAttribute();
      for(final Attribute attr : _attribute) {
        _builder.append(" ");
        String _name = attr.getName();
        _builder.append(_name);
        _builder.append("=\"");
        String _value = attr.getValue();
        _builder.append(_value);
        _builder.append("\"");
      }
    }
    return _builder.toString();
  }
}
