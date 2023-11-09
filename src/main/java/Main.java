public class Main {

    public static void main(String[] args) {
//        Maak een nieuwe klasse aan genaamd `Customer`. Zorg er ook voor dat deze klasse een property `name` heeft van het type String.
//       [x] 2. Maak in de Main klasse een variabele genaamd `customer` aan, van het type `Customer` (de klasse die we net gemaakt hebben) met behulp van het `new` keyword.
//       [x] 3. Na het aanmaken van deze nieuwe instantie kan je de `name`-property toewijzen, geef dit je eigen naam.
//        [x] 4. Je kan daarna als het goed is de naam printen doASDSAD`System.out.println(customer.name);` daaronder te zetten. Als het goed is wordt nu je naam geprint.
//       [x] 5. Onder de `System.out.println(customer.name);` maak een tweede variabele genaamd `customer2` van het type `Customer`. Geef deze een andere naam, en print ook deze.
//        [x] 6. Breidt nu de `Customer` klasse uit met een `lastName` property van type `String` en een `customerNumber` property van type `int`.
//       [x] 7. Voeg aan `Customer` ook een `printName()` methode to. Deze methode heeft geen parameters nodig en mag `void` returnen. In de body van de methode zet je `System.out.println("Customer " + name);`
//        [x]8. Maak twee Constructors. Een met de signature `(String, String)` en een met de signature `(String, String, int)`. _Tip: de ene constructor heeft dus 3 parameters, de andere 2 parameters_.
//        [x]9. In `Main` zie je nu een foutmelding staan bij `()`-haakjes van `new Customer()`. De default Constructor is namelijk komen te vervallen, omdat je 2 custom Constructors hebt gemaakt. Je mag nu voor zowel `customer` als `customer2` een van de nieuwe Constructors gaan gebruiken.
//        [x]10. Verwijder in `Main` de regels `customer.name = ...` en `customer2.name=...`, dit gebeurt nu namelijk al in de constructor.
//        [x]11. Vervang in `Main` ook `System.out.println(customer.name);` en `System.out.println(customer2.name);` door de `printName()` methode van die klassen aan te roepen

        Customer customer = new Customer("Nizar", "Abak", new Creditcard(100));
        Customer customer2 = new Customer("Jan", "Verhagen", new Creditcard(500));
        customer.printName();

        customer.getCreditcard().pay(15);
        System.out.println(customer.getCreditcard().getDebt());

    }
}
