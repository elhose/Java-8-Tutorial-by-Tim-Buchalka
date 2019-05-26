public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer("chujowa drukarka", false);

        printer.fillUP(23);
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.getTonerLevel());

        printer.print(123);
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.getTonerLevel());

        printer.fillUP(24);

        printer.print(20);

        printer.print(200);

        System.out.println(printer.getTonerLevel());

        printer.print(200);

        System.out.println(printer.getPagesPrinted());
    }
}
