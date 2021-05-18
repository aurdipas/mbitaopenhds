/*
 * XML Type:  notesType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.NotesType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML notesType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class NotesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.NotesType
{
    private static final long serialVersionUID = 1L;
    
    public NotesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINK$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "Link");
    private static final javax.xml.namespace.QName EXTLINK$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "ExtLink");
    private static final javax.xml.namespace.QName TABLE$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "table");
    private static final javax.xml.namespace.QName DIV$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "div");
    private static final javax.xml.namespace.QName EMPH$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "emph");
    private static final javax.xml.namespace.QName HEAD$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "head");
    private static final javax.xml.namespace.QName HI$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "hi");
    private static final javax.xml.namespace.QName LIST$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "list");
    private static final javax.xml.namespace.QName P$16 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "p");
    private static final javax.xml.namespace.QName ID$18 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$20 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$22 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$24 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName TYPE$26 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName SUBJECT$28 = 
        new javax.xml.namespace.QName("", "subject");
    private static final javax.xml.namespace.QName LEVEL$30 = 
        new javax.xml.namespace.QName("", "level");
    private static final javax.xml.namespace.QName RESP$32 = 
        new javax.xml.namespace.QName("", "resp");
    private static final javax.xml.namespace.QName SDATREFS$34 = 
        new javax.xml.namespace.QName("", "sdatrefs");
    
    
    /**
     * Gets array of all "Link" elements
     */
    public edu.umich.icpsr.ddi.LinkType[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$0, targetList);
            edu.umich.icpsr.ddi.LinkType[] result = new edu.umich.icpsr.ddi.LinkType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Link" element
     */
    public edu.umich.icpsr.ddi.LinkType getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LinkType target = null;
            target = (edu.umich.icpsr.ddi.LinkType)get_store().find_element_user(LINK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Link" element
     */
    public int sizeOfLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$0);
        }
    }
    
    /**
     * Sets array of all "Link" element
     */
    public void setLinkArray(edu.umich.icpsr.ddi.LinkType[] linkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$0);
        }
    }
    
    /**
     * Sets ith "Link" element
     */
    public void setLinkArray(int i, edu.umich.icpsr.ddi.LinkType link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LinkType target = null;
            target = (edu.umich.icpsr.ddi.LinkType)get_store().find_element_user(LINK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(link);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Link" element
     */
    public edu.umich.icpsr.ddi.LinkType insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LinkType target = null;
            target = (edu.umich.icpsr.ddi.LinkType)get_store().insert_element_user(LINK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Link" element
     */
    public edu.umich.icpsr.ddi.LinkType addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LinkType target = null;
            target = (edu.umich.icpsr.ddi.LinkType)get_store().add_element_user(LINK$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Link" element
     */
    public void removeLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$0, i);
        }
    }
    
    /**
     * Gets array of all "ExtLink" elements
     */
    public edu.umich.icpsr.ddi.ExtLinkType[] getExtLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTLINK$2, targetList);
            edu.umich.icpsr.ddi.ExtLinkType[] result = new edu.umich.icpsr.ddi.ExtLinkType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExtLink" element
     */
    public edu.umich.icpsr.ddi.ExtLinkType getExtLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ExtLinkType target = null;
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().find_element_user(EXTLINK$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ExtLink" element
     */
    public int sizeOfExtLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLINK$2);
        }
    }
    
    /**
     * Sets array of all "ExtLink" element
     */
    public void setExtLinkArray(edu.umich.icpsr.ddi.ExtLinkType[] extLinkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extLinkArray, EXTLINK$2);
        }
    }
    
    /**
     * Sets ith "ExtLink" element
     */
    public void setExtLinkArray(int i, edu.umich.icpsr.ddi.ExtLinkType extLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ExtLinkType target = null;
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().find_element_user(EXTLINK$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extLink);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExtLink" element
     */
    public edu.umich.icpsr.ddi.ExtLinkType insertNewExtLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ExtLinkType target = null;
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().insert_element_user(EXTLINK$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExtLink" element
     */
    public edu.umich.icpsr.ddi.ExtLinkType addNewExtLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ExtLinkType target = null;
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().add_element_user(EXTLINK$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ExtLink" element
     */
    public void removeExtLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLINK$2, i);
        }
    }
    
    /**
     * Gets array of all "table" elements
     */
    public edu.umich.icpsr.ddi.TableType[] getTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TABLE$4, targetList);
            edu.umich.icpsr.ddi.TableType[] result = new edu.umich.icpsr.ddi.TableType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "table" element
     */
    public edu.umich.icpsr.ddi.TableType getTableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType target = null;
            target = (edu.umich.icpsr.ddi.TableType)get_store().find_element_user(TABLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "table" element
     */
    public int sizeOfTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLE$4);
        }
    }
    
    /**
     * Sets array of all "table" element
     */
    public void setTableArray(edu.umich.icpsr.ddi.TableType[] tableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tableArray, TABLE$4);
        }
    }
    
    /**
     * Sets ith "table" element
     */
    public void setTableArray(int i, edu.umich.icpsr.ddi.TableType table)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType target = null;
            target = (edu.umich.icpsr.ddi.TableType)get_store().find_element_user(TABLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(table);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "table" element
     */
    public edu.umich.icpsr.ddi.TableType insertNewTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType target = null;
            target = (edu.umich.icpsr.ddi.TableType)get_store().insert_element_user(TABLE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "table" element
     */
    public edu.umich.icpsr.ddi.TableType addNewTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType target = null;
            target = (edu.umich.icpsr.ddi.TableType)get_store().add_element_user(TABLE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "table" element
     */
    public void removeTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLE$4, i);
        }
    }
    
    /**
     * Gets array of all "div" elements
     */
    public edu.umich.icpsr.ddi.DivType[] getDivArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIV$6, targetList);
            edu.umich.icpsr.ddi.DivType[] result = new edu.umich.icpsr.ddi.DivType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "div" element
     */
    public edu.umich.icpsr.ddi.DivType getDivArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DivType target = null;
            target = (edu.umich.icpsr.ddi.DivType)get_store().find_element_user(DIV$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "div" element
     */
    public int sizeOfDivArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIV$6);
        }
    }
    
    /**
     * Sets array of all "div" element
     */
    public void setDivArray(edu.umich.icpsr.ddi.DivType[] divArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(divArray, DIV$6);
        }
    }
    
    /**
     * Sets ith "div" element
     */
    public void setDivArray(int i, edu.umich.icpsr.ddi.DivType div)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DivType target = null;
            target = (edu.umich.icpsr.ddi.DivType)get_store().find_element_user(DIV$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(div);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "div" element
     */
    public edu.umich.icpsr.ddi.DivType insertNewDiv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DivType target = null;
            target = (edu.umich.icpsr.ddi.DivType)get_store().insert_element_user(DIV$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "div" element
     */
    public edu.umich.icpsr.ddi.DivType addNewDiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DivType target = null;
            target = (edu.umich.icpsr.ddi.DivType)get_store().add_element_user(DIV$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "div" element
     */
    public void removeDiv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIV$6, i);
        }
    }
    
    /**
     * Gets array of all "emph" elements
     */
    public edu.umich.icpsr.ddi.EmphType[] getEmphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMPH$8, targetList);
            edu.umich.icpsr.ddi.EmphType[] result = new edu.umich.icpsr.ddi.EmphType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "emph" element
     */
    public edu.umich.icpsr.ddi.EmphType getEmphArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmphType target = null;
            target = (edu.umich.icpsr.ddi.EmphType)get_store().find_element_user(EMPH$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "emph" element
     */
    public int sizeOfEmphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPH$8);
        }
    }
    
    /**
     * Sets array of all "emph" element
     */
    public void setEmphArray(edu.umich.icpsr.ddi.EmphType[] emphArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(emphArray, EMPH$8);
        }
    }
    
    /**
     * Sets ith "emph" element
     */
    public void setEmphArray(int i, edu.umich.icpsr.ddi.EmphType emph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmphType target = null;
            target = (edu.umich.icpsr.ddi.EmphType)get_store().find_element_user(EMPH$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(emph);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "emph" element
     */
    public edu.umich.icpsr.ddi.EmphType insertNewEmph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmphType target = null;
            target = (edu.umich.icpsr.ddi.EmphType)get_store().insert_element_user(EMPH$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "emph" element
     */
    public edu.umich.icpsr.ddi.EmphType addNewEmph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmphType target = null;
            target = (edu.umich.icpsr.ddi.EmphType)get_store().add_element_user(EMPH$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "emph" element
     */
    public void removeEmph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPH$8, i);
        }
    }
    
    /**
     * Gets array of all "head" elements
     */
    public edu.umich.icpsr.ddi.HeadType[] getHeadArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HEAD$10, targetList);
            edu.umich.icpsr.ddi.HeadType[] result = new edu.umich.icpsr.ddi.HeadType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "head" element
     */
    public edu.umich.icpsr.ddi.HeadType getHeadArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HeadType target = null;
            target = (edu.umich.icpsr.ddi.HeadType)get_store().find_element_user(HEAD$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "head" element
     */
    public int sizeOfHeadArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEAD$10);
        }
    }
    
    /**
     * Sets array of all "head" element
     */
    public void setHeadArray(edu.umich.icpsr.ddi.HeadType[] headArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(headArray, HEAD$10);
        }
    }
    
    /**
     * Sets ith "head" element
     */
    public void setHeadArray(int i, edu.umich.icpsr.ddi.HeadType head)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HeadType target = null;
            target = (edu.umich.icpsr.ddi.HeadType)get_store().find_element_user(HEAD$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(head);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "head" element
     */
    public edu.umich.icpsr.ddi.HeadType insertNewHead(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HeadType target = null;
            target = (edu.umich.icpsr.ddi.HeadType)get_store().insert_element_user(HEAD$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "head" element
     */
    public edu.umich.icpsr.ddi.HeadType addNewHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HeadType target = null;
            target = (edu.umich.icpsr.ddi.HeadType)get_store().add_element_user(HEAD$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "head" element
     */
    public void removeHead(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEAD$10, i);
        }
    }
    
    /**
     * Gets array of all "hi" elements
     */
    public edu.umich.icpsr.ddi.HiType[] getHiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HI$12, targetList);
            edu.umich.icpsr.ddi.HiType[] result = new edu.umich.icpsr.ddi.HiType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hi" element
     */
    public edu.umich.icpsr.ddi.HiType getHiArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HiType target = null;
            target = (edu.umich.icpsr.ddi.HiType)get_store().find_element_user(HI$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hi" element
     */
    public int sizeOfHiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HI$12);
        }
    }
    
    /**
     * Sets array of all "hi" element
     */
    public void setHiArray(edu.umich.icpsr.ddi.HiType[] hiArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hiArray, HI$12);
        }
    }
    
    /**
     * Sets ith "hi" element
     */
    public void setHiArray(int i, edu.umich.icpsr.ddi.HiType hi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HiType target = null;
            target = (edu.umich.icpsr.ddi.HiType)get_store().find_element_user(HI$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hi);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hi" element
     */
    public edu.umich.icpsr.ddi.HiType insertNewHi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HiType target = null;
            target = (edu.umich.icpsr.ddi.HiType)get_store().insert_element_user(HI$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hi" element
     */
    public edu.umich.icpsr.ddi.HiType addNewHi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HiType target = null;
            target = (edu.umich.icpsr.ddi.HiType)get_store().add_element_user(HI$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "hi" element
     */
    public void removeHi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HI$12, i);
        }
    }
    
    /**
     * Gets array of all "list" elements
     */
    public edu.umich.icpsr.ddi.ListType[] getListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LIST$14, targetList);
            edu.umich.icpsr.ddi.ListType[] result = new edu.umich.icpsr.ddi.ListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "list" element
     */
    public edu.umich.icpsr.ddi.ListType getListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ListType target = null;
            target = (edu.umich.icpsr.ddi.ListType)get_store().find_element_user(LIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "list" element
     */
    public int sizeOfListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$14);
        }
    }
    
    /**
     * Sets array of all "list" element
     */
    public void setListArray(edu.umich.icpsr.ddi.ListType[] listArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listArray, LIST$14);
        }
    }
    
    /**
     * Sets ith "list" element
     */
    public void setListArray(int i, edu.umich.icpsr.ddi.ListType list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ListType target = null;
            target = (edu.umich.icpsr.ddi.ListType)get_store().find_element_user(LIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(list);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "list" element
     */
    public edu.umich.icpsr.ddi.ListType insertNewList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ListType target = null;
            target = (edu.umich.icpsr.ddi.ListType)get_store().insert_element_user(LIST$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "list" element
     */
    public edu.umich.icpsr.ddi.ListType addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ListType target = null;
            target = (edu.umich.icpsr.ddi.ListType)get_store().add_element_user(LIST$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "list" element
     */
    public void removeList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$14, i);
        }
    }
    
    /**
     * Gets array of all "p" elements
     */
    public edu.umich.icpsr.ddi.PType[] getPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(P$16, targetList);
            edu.umich.icpsr.ddi.PType[] result = new edu.umich.icpsr.ddi.PType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "p" element
     */
    public edu.umich.icpsr.ddi.PType getPArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PType target = null;
            target = (edu.umich.icpsr.ddi.PType)get_store().find_element_user(P$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "p" element
     */
    public int sizeOfPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(P$16);
        }
    }
    
    /**
     * Sets array of all "p" element
     */
    public void setPArray(edu.umich.icpsr.ddi.PType[] pArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pArray, P$16);
        }
    }
    
    /**
     * Sets ith "p" element
     */
    public void setPArray(int i, edu.umich.icpsr.ddi.PType p)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PType target = null;
            target = (edu.umich.icpsr.ddi.PType)get_store().find_element_user(P$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(p);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "p" element
     */
    public edu.umich.icpsr.ddi.PType insertNewP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PType target = null;
            target = (edu.umich.icpsr.ddi.PType)get_store().insert_element_user(P$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "p" element
     */
    public edu.umich.icpsr.ddi.PType addNewP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PType target = null;
            target = (edu.umich.icpsr.ddi.PType)get_store().add_element_user(P$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "p" element
     */
    public void removeP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(P$16, i);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlID xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$18) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$18);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$18);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$18);
        }
    }
    
    /**
     * Gets the "xml-lang" attribute
     */
    public java.lang.String getXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xml-lang" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$20);
            return target;
        }
    }
    
    /**
     * True if has "xml-lang" attribute
     */
    public boolean isSetXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XMLLANG$20) != null;
        }
    }
    
    /**
     * Sets the "xml-lang" attribute
     */
    public void setXmlLang(java.lang.String xmlLang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$20);
            }
            target.setStringValue(xmlLang);
        }
    }
    
    /**
     * Sets (as xml) the "xml-lang" attribute
     */
    public void xsetXmlLang(org.apache.xmlbeans.XmlNMTOKEN xmlLang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$20);
            }
            target.set(xmlLang);
        }
    }
    
    /**
     * Unsets the "xml-lang" attribute
     */
    public void unsetXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XMLLANG$20);
        }
    }
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$22);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$22) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$22);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$22);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$22);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.NotesType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$24);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.NotesType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.NotesType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType.Source target = null;
            target = (edu.umich.icpsr.ddi.NotesType.Source)get_store().find_attribute_user(SOURCE$24);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.NotesType.Source)get_default_attribute_value(SOURCE$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "source" attribute
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCE$24) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.NotesType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$24);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.NotesType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType.Source target = null;
            target = (edu.umich.icpsr.ddi.NotesType.Source)get_store().find_attribute_user(SOURCE$24);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.NotesType.Source)get_store().add_attribute_user(SOURCE$24);
            }
            target.set(source);
        }
    }
    
    /**
     * Unsets the "source" attribute
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCE$24);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$26);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$26) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$26);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$26);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$26);
        }
    }
    
    /**
     * Gets the "subject" attribute
     */
    public java.lang.String getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBJECT$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subject" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBJECT$28);
            return target;
        }
    }
    
    /**
     * True if has "subject" attribute
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBJECT$28) != null;
        }
    }
    
    /**
     * Sets the "subject" attribute
     */
    public void setSubject(java.lang.String subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBJECT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBJECT$28);
            }
            target.setStringValue(subject);
        }
    }
    
    /**
     * Sets (as xml) the "subject" attribute
     */
    public void xsetSubject(org.apache.xmlbeans.XmlString subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBJECT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUBJECT$28);
            }
            target.set(subject);
        }
    }
    
    /**
     * Unsets the "subject" attribute
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBJECT$28);
        }
    }
    
    /**
     * Gets the "level" attribute
     */
    public java.lang.String getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVEL$30);
            return target;
        }
    }
    
    /**
     * True if has "level" attribute
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVEL$30) != null;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(java.lang.String level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$30);
            }
            target.setStringValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(org.apache.xmlbeans.XmlString level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVEL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LEVEL$30);
            }
            target.set(level);
        }
    }
    
    /**
     * Unsets the "level" attribute
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVEL$30);
        }
    }
    
    /**
     * Gets the "resp" attribute
     */
    public java.lang.String getResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESP$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resp" attribute
     */
    public org.apache.xmlbeans.XmlString xgetResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESP$32);
            return target;
        }
    }
    
    /**
     * True if has "resp" attribute
     */
    public boolean isSetResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESP$32) != null;
        }
    }
    
    /**
     * Sets the "resp" attribute
     */
    public void setResp(java.lang.String resp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESP$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESP$32);
            }
            target.setStringValue(resp);
        }
    }
    
    /**
     * Sets (as xml) the "resp" attribute
     */
    public void xsetResp(org.apache.xmlbeans.XmlString resp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESP$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESP$32);
            }
            target.set(resp);
        }
    }
    
    /**
     * Unsets the "resp" attribute
     */
    public void unsetResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESP$32);
        }
    }
    
    /**
     * Gets the "sdatrefs" attribute
     */
    public java.util.List getSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$34);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "sdatrefs" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$34);
            return target;
        }
    }
    
    /**
     * True if has "sdatrefs" attribute
     */
    public boolean isSetSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SDATREFS$34) != null;
        }
    }
    
    /**
     * Sets the "sdatrefs" attribute
     */
    public void setSdatrefs(java.util.List sdatrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SDATREFS$34);
            }
            target.setListValue(sdatrefs);
        }
    }
    
    /**
     * Sets (as xml) the "sdatrefs" attribute
     */
    public void xsetSdatrefs(org.apache.xmlbeans.XmlIDREFS sdatrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(SDATREFS$34);
            }
            target.set(sdatrefs);
        }
    }
    
    /**
     * Unsets the "sdatrefs" attribute
     */
    public void unsetSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SDATREFS$34);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.NotesType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.NotesType.Source
    {
        private static final long serialVersionUID = 1L;
        
        public SourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}