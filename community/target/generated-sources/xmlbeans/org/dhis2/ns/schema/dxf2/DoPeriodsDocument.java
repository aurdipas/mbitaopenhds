/*
 * An XML document type.
 * Localname: doPeriods
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DoPeriodsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one doPeriods(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface DoPeriodsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DoPeriodsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("doperiods9939doctype");
    
    /**
     * Gets the "doPeriods" element
     */
    org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum getDoPeriods();
    
    /**
     * Gets (as xml) the "doPeriods" element
     */
    org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods xgetDoPeriods();
    
    /**
     * Sets the "doPeriods" element
     */
    void setDoPeriods(org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum doPeriods);
    
    /**
     * Sets (as xml) the "doPeriods" element
     */
    void xsetDoPeriods(org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods doPeriods);
    
    /**
     * An XML doPeriods(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.DoPeriodsDocument$DoPeriods.
     */
    public interface DoPeriods extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DoPeriods.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("doperiods26ecelemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum TRUE = Enum.forString("true");
        static final Enum FALSE = Enum.forString("false");
        
        static final int INT_TRUE = Enum.INT_TRUE;
        static final int INT_FALSE = Enum.INT_FALSE;
        
        /**
         * Enumeration value class for org.dhis2.ns.schema.dxf2.DoPeriodsDocument$DoPeriods.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_TRUE
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_TRUE = 1;
            static final int INT_FALSE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("true", INT_TRUE),
                    new Enum("false", INT_FALSE),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods newValue(java.lang.Object obj) {
              return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods) type.newValue( obj ); }
            
            public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods newInstance() {
              return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DoPeriodsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
