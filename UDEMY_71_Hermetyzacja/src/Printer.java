public class Printer {

    private String name;
    private float tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplexPrinter;

    public Printer(String name, boolean duplexPrinter) {
        this.name = name;
        this.duplexPrinter = duplexPrinter;
    }

    public float fillUP(int level){
        if (this.tonerLevel > 100){
            System.out.println("Printer already have full catridge");
            return -1;
        }
        if (this.tonerLevel + level <= 100){
            this.tonerLevel += level;
            System.out.println("Printer toner level was refilled to " + this.tonerLevel );
            return tonerLevel;
        }
        else
        {
            System.out.println("You can't overfill printer");
            return -1;
        }

    }

    public int print(int pages)   {

        int licznik=0;
        if (this.duplexPrinter){
            //drukowanie na dwóch stronach

            if((this.tonerLevel-pages*0.25)>=0){
                System.out.println("Printing " + pages + " pages in duplex printing");
                this.tonerLevel -= pages*0.25;
                return this.pagesPrinted += (pages/2 + pages%2);
            }
            else{
                    while(this.tonerLevel>=0){
                        this.tonerLevel -= 0.25;
                        licznik++;
                    }

                System.out.println("Printing " + licznik + " pages in duplex printing, to print " + (pages-licznik) +" more refill toner");
                this.tonerLevel =0;
                return this.pagesPrinted += (pages/2 + pages%2);
            }

        }
        else {
            if((this.tonerLevel-pages*0.25)>=0) {
                System.out.println("Printing " + pages + " pages NOT in duplex printing");
                this.tonerLevel -= pages * 0.25;
                return this.pagesPrinted += pages;
            }

            else{
                while(this.tonerLevel>=0){
                    this.tonerLevel -= 0.25;
                    licznik++;
                }

                System.out.println("Printing " + licznik + " pages in duplex printing, to print " + (pages-licznik) +" more refill toner");
                this.tonerLevel =0;
                return this.pagesPrinted += pages;
            }
          }
    }
    public float getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
