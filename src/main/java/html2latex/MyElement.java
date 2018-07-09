/*
 * Element.java
*/

package html2latex;

import java.util.*;


/**
 *  Class representing HTML start element.
*/
class ElementStart extends MyElement {
    
    /** Map containing all element's attributtes with their values. */
    private HashMap<String, String> _attributes;
    
    /**
     * Cstr.
     * @param element element's name
     * @param attributes element's attributes
     */
    public ElementStart(String element, HashMap<String, String> attributes) {
        _element = element;
        _attributes = attributes;
    }
    
    /**
     * Returns element's attributes.
     * @return element's attributes
     */
    HashMap<String, String> getAttributes() { return _attributes; }
      
}


/**
 *  Class representing HTML end element.
*/
class ElementEnd extends MyElement {
    
    /**
     * Cstr.
     * @param element element's name
     */
    ElementEnd(String element) {
        _element = element;
    }
    ElementEnd(String element,String content) {
        _element = element;
        this.content=content;
    }
}


/**
 * Abstract class for HTML start and end elements (tags).
*/
abstract class MyElement {
    /** Element's name */
    protected String _element;
    protected String content=null;
    
    /**
     * Returns element's name.
     * @return element's name
     */
    String getElementName() { return _element; }

    String getContent() { return content; }

    void setContent(String value) {
        this.content=value;
    }
    
    
}


