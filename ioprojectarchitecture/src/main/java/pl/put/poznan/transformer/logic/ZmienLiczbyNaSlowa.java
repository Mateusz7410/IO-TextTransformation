package pl.put.poznan.transformer.logic;

class ZmienLiczbyNaSlowa extends  TransformedText {
    ZmienLiczbyNaSlowa(Text text) {
        super(text);
    }

    @Override
    protected String getTransformedText(String text){
        return zmienLiczbyNaSlowa(text);
    }

    public String zmienLiczbyNaSlowa(String text)
    {
        //te dwie linijki powinny isc na start programu - tworzymy tutaj tablice z ktorych potem mozemy korzystac wielokrotnie
        Generators gen = new Generators();
        gen.generatorLiczb();


        //jak oznaczyc znak konca ciagu?
        text = text.replaceAll("[.]1$"," i jedna dziesiąta");
        text = text.replaceAll("[.]1\\s"," i jedna dziesiąta ");
        text = text.replaceAll("[.]2$"," i dwie dziesiąte");
        text = text.replaceAll("[.]2\\s"," i dwie dziesiąte ");
        text = text.replaceAll("[.]3$"," i trzy dziesiąte");
        text = text.replaceAll("[.]3\\s"," i trzy dziesiąte ");
        text = text.replaceAll("[.]4$"," i cztery dziesiąte");
        text = text.replaceAll("[.]4\\s"," i cztery dziesiąte ");
        text = text.replaceAll("[.]5$"," i pół");
        text = text.replaceAll("[.]5\\s"," i pół ");
        text = text.replaceAll("[.]6$"," i sześć dziesiątych");
        text = text.replaceAll("[.]6\\s"," i sześć dziesiątych ");
        text = text.replaceAll("[.]7$"," i siedem dziesiątych");
        text = text.replaceAll("[.]7\\s"," i siedem dziesiątych ");
        text = text.replaceAll("[.]8$"," i osiem dziesiątych");
        text = text.replaceAll("[.]8\\s"," i osiem dziesiątych ");
        text = text.replaceAll("[.]9$"," i dziewięć dziesiątych");
        text = text.replaceAll("[.]9\\s"," i dziewięć dziesiątych ");

        text = text.replaceAll("[.]01"," i jedna setna");
        text = text.replaceAll("[.]02"," i dwie setne");
        text = text.replaceAll("[.]03"," i trzy setne");
        text = text.replaceAll("[.]04"," i cztery setne");
        text = text.replaceAll("[.]05"," i pięć setnych");
        text = text.replaceAll("[.]06"," i sześć setnych");
        text = text.replaceAll("[.]07"," i siedem setnych");
        text = text.replaceAll("[.]08"," i osiem setnych");
        text = text.replaceAll("[.]09"," i dziewięć setnych");



        int koncowka=0;
        String setne[] = {"setnych","setne"};
        for(int i=99;i>9;i--) {
            if(i>20 && (i%10==2 || i%10==3 || i%10==4))
            {
                koncowka=1;
            }
            else
            {
                koncowka=0;
            }
            String liczba = "[.]"+gen.numberNumber[i];
            String liczbaSlowo = gen.numberWord[i];
            text = text.replaceAll(liczba, " i "+liczbaSlowo+" "+setne[koncowka]);
        }

        for(int i=1000; i>0; i--) {
            text = text.replaceAll(gen.numberNumber[i], gen.numberWord[i]);
        }

        text = text.replaceAll("0","zero");
        return text;
    }
}
