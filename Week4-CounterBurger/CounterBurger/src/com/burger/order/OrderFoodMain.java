package com.burger.order;

import java.util.Scanner;


public class OrderFoodMain {

    private static Scanner scan;


    public static void main(String[] args){
        System.out.println("Choose Burger:");
        System.out.println("Choose from");
        System.out.println("1. Beef | 2. Chicken | 3. Turkey | 4. veggie");
        scan = new Scanner(System.in);
        Burger burger = null;

        int burgerType = scan.nextInt();
        if(burgerType == 1)
        {
            burger = new Beef();
        } else if(burgerType == 2)
        {
            burger = new Chicken();
        } else if(burgerType == 3)
        {
            burger = new Turkey();
        } else if(burgerType == 4)
        {
            burger = new Veggie();
        } else {
            System.out.println("You have not selected any type.  ");
            System.exit(0);
        }

        System.out.println("Choose Size");
        System.out.println("1. 1/3Lb (9.50$) | 2. 2/3Lb. (11.50$) | 3. 1Lb. (15.50$)");
        scan = new Scanner(System.in);
        int burgerSize = scan.nextInt();
        if(burgerSize == 1){
            burger = new OneThirdSize(burger);
        } else  if(burgerSize == 2){
            burger = new TwoThirdSize(burger);
        } else  if(burgerSize == 3){
            burger = new OneSize(burger);
        } else {
            System.out.println("You have not selected any size.  ");
            System.exit(0);
        }



        System.out.println("Choose a Burger Style");
        System.out.println("1. On a Bun | 2. In a bowl ($ 1)");
        scan = new Scanner(System.in);
        int burgerStyle = scan.nextInt();
        if(burgerStyle == 1){
            burger = new OnABunServe(burger);
        } else  if(burgerStyle == 2){
            burger = new InABowlServe(burger);

        } else {
            System.out.println("You have not selected any Style.  ");
            System.exit(0);
        }


        burger = selectCheese(burger);
        System.out.println("After selecting cheese $ " + burger.cost());

        burger = selectToppings(burger);
        System.out.println("After selecting toppings $ " + burger.cost());


        burger = selectPremiumToppings(burger);
        System.out.println("After Premium Toppings $ " + burger.cost());

        burger = selectSauce(burger);
        System.out.println("After selecting sauce : $ " + burger.cost());

        System.out.println("Final cost " + burger.getDescription() + "\n $ " + burger.cost());
    }


    /**
     * Select Cheese
     * @param burger
     * @return
     */
    private static Burger selectCheese(Burger burger) {
        System.out.println("Select a Cheese (Extra $ 1)");
        System.out.println("1. Danish Blue Cheese | 2. Greek Feta | 3. Gruyere | 4. Herb Goat Cheese Spread\n" +
                "5. Horseradish Cheddar | 6. Imported Swiss | 7. Jalapano Jack | 8. Sharp Provolone |\n9. Soft Ripened Brie" +
                "10. Tillamook Cheddar | 11. Yellow American | 0. Go to Next Selection");

        int cnt = 0;
        int cheese = -1;
        while(cheese != 0) {
            scan = new Scanner(System.in);
             cheese = scan.nextInt();
            if (cheese == 1) {
                burger = new DanishBlueCheese(burger);cnt++;
            } else if (cheese == 2) {
                burger = new GreekFeta(burger);cnt++;
            } else if (cheese == 3) {
                burger = new HerbGoatCheeseSpread(burger);cnt++;
            } else if (cheese == 4) {
                burger = new HoreseRadishCheddar(burger);cnt++;
            } else if (cheese == 5) {
                burger = new ImportedSwiss(burger);cnt++;
            } else if (cheese == 6) {
                burger = new JalapenoJack(burger);cnt++;
            } else if (cheese == 7) {
                burger = new SharpProvoine(burger);cnt++;
            } else if (cheese == 8) {
                burger = new SoftRippedBrie(burger);cnt++;
            } else if (cheese == 9) {
                burger = new TillamookCheddar(burger);cnt++;
            } else if (cheese == 10) {
                burger = new YellowAmerican(burger);cnt++;
            } else if(cheese == 0){
                System.out.println("\nYou have selected " + cnt + " Cheese.  ");
                if(cnt > 1) {
                    System.out.println("\n Cost would be applied for cheese $" + 1*(cnt-1)  );
                }
                break;
            } else {
                System.out.println("Enter correct selection ");
                //System.exit(0);
            }
        }

        return burger;
    }


    /**
     * Select Premium Toppings
     * @param burger
     * @return
     */
    private static Burger selectPremiumToppings(Burger burger){

        System.out.println("\nChoose Premium Toppings ($ 1.50)");
        System.out.println("1. ApplewoodSmokedBacon | 2. Avocado | 3. BlackForestHam | 4. Chili | 5. FriedEgg | " +
                "\n6. FriedOnionStrings | 7. HousemadeGuacamole | 8. SauteedMushrooms | 9. SunDriedTomatoes");

        int cnt = 0;
        int premiumtoppings = -1;
        while(premiumtoppings != 0) {
            scan = new Scanner(System.in);
            premiumtoppings = scan.nextInt();

            if (premiumtoppings == 1) {
                burger = new ApplewoodSmokedBacon(burger);
                cnt++;
            } else if (premiumtoppings == 2) {
                burger = new Avocado(burger);
                cnt++;
            } else if (premiumtoppings == 3) {
                burger = new BlackForestHam(burger);
                cnt++;
            } else if (premiumtoppings == 4) {
                burger = new Chili(burger);
                cnt++;
            } else if (premiumtoppings == 5) {
                burger = new FriedEgg(burger);
                cnt++;
            } else if (premiumtoppings == 6) {
                burger = new FriedOnionStrings(burger);
                cnt++;
            } else if (premiumtoppings == 7) {
                burger = new HousemadeGuacamole(burger);
                cnt++;
            } else if (premiumtoppings == 8) {
                burger = new SauteedMushrooms(burger);
                cnt++;
            } else if (premiumtoppings == 9) {
                burger = new SunDriedTomatoes(burger);
                cnt++;
            }  else if(premiumtoppings == 0){
                System.out.println("\nYou have selected " + cnt + " Toppings. Cost would be applied for Toppings $" + 1.50*cnt);
                break;
            } else {
                System.out.println("Enter correct selection ");
                //System.exit(0);
            }
        }

        return burger;
    }

    /**
     * Select Sauce
     * @param burger
     * @return
     */
    private static Burger selectSauce(Burger burger){

            System.out.println("\nChoose a Sauce ($ 0.75)");
            System.out.println("1. ApricotSauce | 2. BasilPesto | 3. ChipotleAioli | 4. ClassicCaesar | 5. CountryButterMilkRanch | " +
                    "\n6. DijonBalsamicDressing | 7. GingerSoyGlaze | 8. HoneyMustard | 9. HorseRadishMayo | 10. HotWingSauce | " +
                    "\n11. Mayonnaise 12. PeanutSauce | 13. RedRelish | 14. RoastedGarlicAioli | 15. RussianDressing | " +
                "\n16. SpicySourCream | 17. SteakSauce | 18. SunDriedTomatoVinaigrette | 19. SweetBBQSauce | 20. TzatzikiSauce | 0. Go to Next selection");

            int cnt = 0;
            int sauce = -1;
            while(sauce != 0) {
                scan = new Scanner(System.in);
                sauce = scan.nextInt();

                if (sauce == 1) {
                    burger = new ApricotSauce(burger);
                    cnt++;
                } else if (sauce == 2) {
                    burger = new BasilPesto(burger);
                    cnt++;
                } else if (sauce == 3) {
                    burger = new ChipotleAioli(burger);
                    cnt++;
                } else if (sauce == 4) {
                    burger = new ClassicCaesar(burger);
                    cnt++;
                } else if (sauce == 5) {
                    burger = new CountryButterMilkRanch(burger);
                    cnt++;
                } else if (sauce == 6) {
                    burger = new DijonBalsamicDressing(burger);
                    cnt++;
                } else if (sauce == 7) {
                    burger = new GingerSoyGlaze(burger);
                    cnt++;
                } else if (sauce == 8) {
                    burger = new HoneyMustard(burger);
                    cnt++;
                } else if (sauce == 9) {
                    burger = new HorseRadishMayo(burger);
                    cnt++;
                }  else if (sauce == 10) {
                    burger = new HotWingSauce(burger);
                    cnt++;
                } else if (sauce == 11) {
                    burger = new Mayonnaise(burger);
                    cnt++;
                } else if (sauce == 12) {
                    burger = new PeanutSauce(burger);
                    cnt++;
                } else if (sauce == 13) {
                    burger = new RedRelish(burger);
                    cnt++;
                } else if (sauce == 14) {
                    burger = new RoastedGarlicAioli(burger);
                    cnt++;
                } else if (sauce == 15) {
                    burger = new RussianDressing(burger);
                    cnt++;
                } else if (sauce == 16) {
                    burger = new SpicySourCream(burger);
                    cnt++;
                } else if (sauce == 17) {
                    burger = new SteakSauce(burger);
                    cnt++;
                } else if (sauce == 18) {
                    burger = new SunDriedTomatoVinaigrette(burger);
                    cnt++;
                } else if (sauce == 19) {
                    burger = new SweetBBQSauce(burger);
                    cnt++;
                } else if (sauce == 20) {
                    burger = new TzatzikiSauce(burger);
                    cnt++;
                } else if(sauce == 0){
                    System.out.println("\nYou have selected " + cnt + " Sauce");
                    if(cnt > 1)
                        System.out.println("Cost would be applied for Sauce $" + 0.75*(cnt-1)  );
                    break;
                } else {
                    System.out.println("Enter correct selection ");
                    //System.exit(0);
                }
            }

            return burger;

    }

    /**
     * Select Toppings
     * @param burger
     * @return
     */
    private static Burger selectToppings(Burger burger){
        System.out.println("\nChoose upto 4 Toppings");
        System.out.println("1. Bermuda Red Onion | 2. Black Olives | 3. Carrot Strings | 4. Coleslaw | 5. Dill Pickle Chips | " +
                "\n6. Dried Cranberries | 7. Grilled Onions | 8. Grilled Pineapple | 9. Hard Boiled Eggs | 10. Jalapenos | " +
                "\n11. Lettuce Blend 12. Organic Mixed Greens | 13. Roasted Green Chiles | 14. Roasted Corn & Black Bean Salsa | 15. Roasted Red Peppers | " +
                "\n16. Scallions | 17. Sliced Cucumbers | 18. Spicy Pepperoncinis | 19. Sprouts | 20. Tomatoes | 0. Go to Next selection");

        int cnt = 0;
        int toppings = -1;
        while(toppings != 0) {
            scan = new Scanner(System.in);
            toppings = scan.nextInt();

            if (toppings == 1) {
                burger = new BermudaRedOnion(burger);
                cnt++;
            } else if (toppings == 2) {
                burger = new BlackOlives(burger);
                cnt++;
            } else if (toppings == 3) {
                burger = new CarrotStrings(burger);
                cnt++;
            } else if (toppings == 4) {
                burger = new ColeSlaw(burger);
                cnt++;
            } else if (toppings == 5) {
                burger = new DilliPickleChips(burger);
                cnt++;
            } else if (toppings == 6) {
                burger = new DriedCranberries(burger);
                cnt++;
            } else if (toppings == 7) {
                burger = new GrilledOnions(burger);
                cnt++;
            } else if (toppings == 8) {
                burger = new GrilledPineapple(burger);
                cnt++;
            } else if (toppings == 9) {
                burger = new HardBoiledEggs(burger);
                cnt++;
            } else if (toppings == 10) {
                burger = new Jalapenos(burger);
                cnt++;
            } else if (toppings == 11) {
                burger = new LettuceBlend(burger);
                cnt++;
            } else if (toppings == 12) {
                burger = new OrganicMixedGreens(burger);
                cnt++;
            } else if (toppings == 13) {
                burger = new RoastedGreenChiles(burger);
                cnt++;
            } else if (toppings == 14) {
                burger = new RoastedCornBlackBeanSalsa(burger);
                cnt++;
            } else if (toppings == 15) {
                burger = new RoastedRedPeppers(burger);
                cnt++;
            } else if (toppings == 16) {
                burger = new Scallions(burger);
                cnt++;
            } else if (toppings == 17) {
                burger = new SlicedCucumbers(burger);
                cnt++;
            } else if (toppings == 18) {
                burger = new SpicyPepperoncinis(burger);
                cnt++;
            } else if (toppings == 19) {
                burger = new Sprouts(burger);
                cnt++;
            } else if (toppings == 20) {
                burger = new Tomatoes(burger);
                cnt++;
            } else if(toppings == 0){
                System.out.println("\nYou have selected " + cnt + " Toppings.  ");
                if(cnt > 4) {
                    System.out.println("\n Cost would be applied for Toppings $" + 0.75*(cnt-4)  );
                }
                break;
            } else {
                System.out.println("Enter correct selection ");
                //System.exit(0);
            }
        } return burger;
    }
}
