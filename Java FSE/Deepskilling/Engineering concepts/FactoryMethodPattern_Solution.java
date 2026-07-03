/*
QUESTION:
Implementing the Factory Method Pattern
Scenario: Create factory for Word, PDF, Excel documents.
*/

interface Document { void open(); }
class WordDoc implements Document { public void open() { System.out.println("Opening Word Doc"); } }
class PdfDoc implements Document { public void open() { System.out.println("Opening PDF Doc"); } }
abstract class DocumentFactory { abstract Document createDocument(); }
class WordFactory extends DocumentFactory { Document createDocument() { return new WordDoc(); } }
class PdfFactory extends DocumentFactory { Document createDocument() { return new PdfDoc(); } }
public class Exercise2_FactoryMethodPattern_Solution {
    public static void main(String[] args) {
        DocumentFactory factory = new PdfFactory();
        factory.createDocument().open();
    }
}
