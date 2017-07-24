package com.burger.order;

public class Main {

    public static void main(String[] args) {

        Burger burger1 = new Beef();

        burger1 = new OneThirdSize(burger1);

        burger1 = new OnABunServe(burger1);

        burger1 = new DanishBlueCheese(burger1);

        burger1 = new HoreseRadishCheddar(burger1);

        burger1 = new GreekFeta(burger1);

        System.out.println(burger1.getDescription() +" $ " + burger1.cost());

        burger1 = new BermudaRedOnion(burger1);

        burger1 = new BlackOlives(burger1);

        burger1 = new CarrotStrings(burger1);

        burger1 = new ColeSlaw(burger1);

        burger1 = new DilliPickleChips(burger1);

        burger1 = new ApplewoodSmokedBacon(burger1);

        burger1 = new ApricotSauce(burger1);

        System.out.println(burger1.getDescription() +" $ " + burger1.cost());
/*
        Burger burger2 = new Turkey();
        burger2 = new OneSize(burger2);
        burger2 = new InABowlServe(burger2);
        burger2 = new GreekFeta(burger2);
        burger2 = new DriedCranberries(burger2);
        burger2 = new GrilledOnions(burger2);
        burger2 = new LettuceBlend(burger2);
        burger2 = new Scallions(burger2);
        burger2 = new SweetBBQSauce(burger2);
        System.out.println(burger2.getDescription() +" $ " + burger2.cost());*/


    }
}
