public class ZmienLiczbyNaSlowa extends  TransformedText {
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
        text = text.replaceAll("[.]1$"," i jedna dziesiata");
        text = text.replaceAll("[.]1\\s"," i jedna dziesiata ");
        text = text.replaceAll("[.]2$"," i dwie dziesiate");
        text = text.replaceAll("[.]2\\s"," i dwie dziesiate ");
        text = text.replaceAll("[.]3$"," i trzy dziesiate");
        text = text.replaceAll("[.]3\\s"," i trzy dziesiate ");
        text = text.replaceAll("[.]4$"," i cztery dziesiate");
        text = text.replaceAll("[.]4\\s"," i cztery dziesiate ");
        text = text.replaceAll("[.]5$"," i pol");
        text = text.replaceAll("[.]5\\s"," i pol ");
        text = text.replaceAll("[.]6$"," i szesc dziesiatych");
        text = text.replaceAll("[.]6\\s"," i szesc dziesiatych ");
        text = text.replaceAll("[.]7$"," i siedem dziesiatych");
        text = text.replaceAll("[.]7\\s"," i siedem dziesiatych ");
        text = text.replaceAll("[.]8$"," i osiem dziesiatych");
        text = text.replaceAll("[.]8\\s"," i osiem dziesiatych ");
        text = text.replaceAll("[.]9$"," i dziewiec dziesiatych");
        text = text.replaceAll("[.]9\\s"," i dziewiec dziesiatych ");

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
        return text;
    }
}
