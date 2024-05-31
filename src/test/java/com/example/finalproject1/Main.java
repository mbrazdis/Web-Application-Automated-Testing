package com.example.finalproject1;



import java.util.Objects;

public class Main extends Tests {
    public static void main(String[] args) {
        System.out.println("Ce functionalitate doriti sa testati?");
        System.out.println("1. Logare");
        System.out.println("2. Adaugare in cos");
        System.out.println("3. Checkout");
        System.out.println("4. Social Media");
        System.out.println("5. Menu");
        System.out.print("Alege o optiune: ");
        int q1 = Scan();
        String URL = "";
        if (q1 == 1) {
            System.out.println();
            System.out.println("Ce user doriti sa utilizati pentru test?");
            System.out.println("1. standard_user");
            System.out.println("2. locked_out_user");
            System.out.println("3. problem_user");
            System.out.println("4. performance_glitch_user");
            System.out.println("5. Toate");
            System.out.print("Alege o optiune: ");
            int user = Scan();
            System.out.println();
            System.out.println("LOGIN FUNCTIONALITY TESTS:");
            System.out.println("LOADING...");
            System.out.println();
            int P = 0;
            int F = 0;
            if (user < 5) {
                switch (user) {
                    case 1 -> URL = Login(1);
                    case 2 -> URL = Login(2);
                    case 3 -> URL = Login(3);
                    case 4 -> URL = Login(4);
                }
                if (Objects.equals(URL, INVENTORY_URL)) {
                    P += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("PASSED!");
                    System.out.println("Logarea a fost efectuata cu succes!");
                } else {
                    F += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("FAILED!");
                    System.out.println("Logarea esuata!");
                }
                System.out.println("Total tests run: " + (P + F) + ", Passes: " + P + ", Failures: " + F);
                System.out.println();
                System.out.println("======================================================================");
            } else {
                for (int i = 1; i < 5; i++) {
                    URL = Login(i);

                    if (Objects.equals(URL, "https://www.saucedemo.com/inventory.html")) {
                        P += 1;
                        System.out.println("======================================================================");
                        System.out.println();
                        System.out.println("PASSED!");
                        System.out.println("Logarea a fost efectuata cu succes!");
                    } else {
                        F += 1;
                        System.out.println("======================================================================");
                        System.out.println();
                        System.out.println("FAILED!");
                        System.out.println("Logarea esuata!");
                    }
                    System.out.println("Total tests run: " + (P + F) + ", Passes: " + P + ", Failures: " + F);
                    System.out.println();
                    System.out.println("======================================================================");
                }
            }
        }
            

         else if (q1 == 2) {
            System.out.println("Ce user doriti sa utilizati pentru test?");
            System.out.println("1. standard_user");
            System.out.println("2. locked_out_user");
            System.out.println("3. problem_user");
            System.out.println("4. performance_glitch_user");
            System.out.println("5. Toate");
            int P = 0;
            int F = 0;
            System.out.print("Alege o optiune: ");
            int user = Scan();
            System.out.println("Cate produse doriti sa adaugati in cos?");
            System.out.print("Alege un numar de la 1 la 6: ");
            int nrProduse = Scan();
            System.out.println();
            System.out.println("ADD PRODUCTS FUNCTIONALITY:");
            System.out.println("LOADING...");
            System.out.println();
            String nrProduseS = Integer.toString(nrProduse);
            String cartCount;
            if (user == 5) {
                for (int i = 1; i < 5; i++) {
                    cartCount = AddToCart(i, nrProduse);
                    if (Objects.equals(cartCount, nrProduseS)) {
                        P += 1;
                        System.out.println("======================================================================");
                        System.out.println();
                        System.out.println("PASSED!");
                        System.out.println("Au fost adaugate cu succes " + cartCount + "/" + nrProduse + " produse!");
                    } else if (cartCount.equals("F")) {
                        F += 1;
                        System.out.println("======================================================================");
                        System.out.println();
                        System.out.println("FAILED!");
                        System.out.println("Eroare la logare!");
                    }
                    else {
                        F += 1;
                        System.out.println("======================================================================");
                        System.out.println();
                        System.out.println("FAILED!");
                        System.out.println("Au fost adaugate " + cartCount + "/" + nrProduse + " produse!");
                    }
                    System.out.println("Total tests run: " + (P + F) + ", Passes: " + P + ", Failures: " + F);
                    System.out.println();
                    System.out.println("======================================================================");
                }
            } else {
                cartCount = AddToCart(user, nrProduse);

                if (Objects.equals(cartCount, nrProduseS)) {
                    P += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("PASSED!");
                    System.out.println("Au fost adaugate cu succes " + cartCount + "/" + nrProduse + " produse!");
                }else if (Objects.equals(cartCount, "F")) {
                    F += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("FAILED!");
                    System.out.println("Eroare la logare!");
                }else {
                    System.out.println(cartCount);
                    F += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("FAILED!");
                    System.out.println("Au fost adaugate " + cartCount + "/" + nrProduse + " produse!");
                }
                System.out.println("Total tests run: " + (P + F) + ", Passes: " + P + ", Failures: " + F);
                System.out.println();
                System.out.println("======================================================================");
            }
        } else if (q1 == 3) {
            System.out.println("Ce user doriti sa utilizati pentru test?");
            System.out.println("1. standard_user");
            System.out.println("2. locked_out_user");
            System.out.println("3. problem_user");
            System.out.println("4. performance_glitch_user");
            System.out.println("5. Toate");
            int user = Scan();
            System.out.println();
            System.out.println("CHECKOUT FUNCTIONALITY TESTS:");
            System.out.println("LOADING...");
            System.out.println();
            String URL1 = null;
            int P = 0;
            int F = 0;
            if (user < 5) {
                switch (user) {
                    case 1 -> URL1 = Checkout(1);
                    case 2 -> URL1 = Checkout(2);
                    case 3 -> URL1 = Checkout(3);
                    case 4 -> URL1 = Checkout(4);
                }
                if (Objects.equals(URL1, CHECKOUT2_URL)) {
                    P += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("PASSED!");
                    System.out.println("Comanda a fost plasata cu succes!");
                }
                else if (Objects.equals(URL1, BASE_URL)) {
                    F += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("FAILED!");
                    System.out.println("Logare esuata!");
                }else {
                    F += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("FAILED!");
                    System.out.println("Comanda NU a fost plasata cu succes!");

                }
                System.out.println("Total tests run: " + (P + F) + ", Passes: " + P + ", Failures: " + F);
                System.out.println();
                System.out.println("======================================================================");
            } else {
                for (int i = 1; i < 5; i++) {
                    URL1 = Checkout(i);
                    if (Objects.equals(URL1, CHECKOUT2_URL)) {
                        P += 1;
                        System.out.println("======================================================================");
                        System.out.println();
                        System.out.println("PASSED!");
                        System.out.println("Comanda a fost plasata cu succes!");
                    }
                    else if (Objects.equals(URL1, BASE_URL)) {
                        F += 1;
                        System.out.println("======================================================================");
                        System.out.println();
                        System.out.println("FAILED!");
                        System.out.println("Logare esuata!");
                    }else {
                        F += 1;
                        System.out.println("======================================================================");
                        System.out.println();
                        System.out.println("FAILED!");
                        System.out.println("Comanda NU a fost plasata cu succes!");

                    }
                    System.out.println("Total tests run: " + (P + F) + ", Passes: " + P + ", Failures: " + F);
                    System.out.println();
                    System.out.println("======================================================================");
                }
            }
        }

         else if (q1 == 4) {
            System.out.println("Ce user doriti sa utilizati pentru test?");
            System.out.println("1. standard_user");
            System.out.println("2. locked_out_user");
            System.out.println("3. problem_user");
            System.out.println("4. performance_glitch_user");
            System.out.println("5. Toate");
            System.out.print("Alege o optiune: ");
            int user = Scan();
            System.out.println("Ce buton de Social Media doriti sa testati?");
            System.out.println("1. Twitter");
            System.out.println("2. Facebook");
            System.out.println("3. LINKED In");
            String URL2 = "";
            int P = 0;
            int F = 0;
            System.out.print("Alege o optiune: ");
            int S = Scan();
            System.out.println();
            System.out.println("SOCIAL MEDIA FUNCTIONALITY TESTS:");
            System.out.println("LOADING...");
            System.out.println();
            if (user < 5) {
                switch (user) {
                    case 1 -> {
                        switch (S) {
                            case 1 -> URL2 = SocialMedia(1, 1);
                            case 2 -> URL2 = SocialMedia(1, 2);
                            case 3 -> URL2 = SocialMedia(1, 3);
                        }
                    }
                    case 2 -> {
                        switch (S) {
                            case 1 -> URL2 = SocialMedia(2, 1);
                            case 2 -> URL2 = SocialMedia(2, 2);
                            case 3 -> URL2 = SocialMedia(2, 3);
                        }
                    }
                    case 3 -> {
                        switch (S) {
                            case 1 -> URL2 = SocialMedia(3, 1);
                            case 2 -> URL2 = SocialMedia(3, 2);
                            case 3 -> URL2 = SocialMedia(3, 3);
                        }
                    }
                    case 4 -> {
                        switch (S) {
                            case 1 -> URL2 = SocialMedia(4, 1);
                            case 2 -> URL2 = SocialMedia(4, 2);
                            case 3 -> URL2 = SocialMedia(4, 3);
                        }
                    }
                }
                if (URL2.equals(TWITTER_URL) || URL2.equals(FACEBOOK_URL) || URL2.equals(LINKEDIN_URL) || URL2.equals(LINKEDIN_URL2) || URL2.contains(LINKEDIN_URL3)) {
                    P += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("PASSED!");
                    System.out.println("Butonul pentru pagina de Twitter/Facebook/Linkedin functioneaza in parametri ok!");
                }else if (URL2.equals(BASE_URL)) {
                    System.out.println(URL2);
                    F += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("FAILED!");
                    System.out.println("Logare esuata!");

                }
                else {
                    System.out.println(URL2);
                    F += 1;
                    System.out.println("======================================================================");
                    System.out.println();
                    System.out.println("FAILED!");
                    System.out.println("Butonul pentru pagina de Twitter/Facebook/Linkedin NU functioneaza in parametri ok!");
                }
                System.out.println("Total tests run: " + (P + F) + ", Passes: " + P + ", Failures: " + F);
                System.out.println();
                System.out.println("======================================================================");
            }
            else {
                for (int i = 1; i < 5; i++){
                    for(int j = 1; j < 4; j++){
                        URL2 = SocialMedia(i, j);
                        if (URL2.equals(TWITTER_URL) || URL2.equals(FACEBOOK_URL) || URL2.equals(LINKEDIN_URL) || URL2.contains(LINKEDIN_URL3)) {
                            P += 1;
                            System.out.println("======================================================================");
                            System.out.println();
                            System.out.println("PASSED!");
                            System.out.println("Butonul pentru pagina de Twitter/Facebook/Linkedin functioneaza in parametri ok!");
                        }else if (URL2.equals(BASE_URL)) {
                            System.out.println(URL2);
                            F += 1;
                            System.out.println("======================================================================");
                            System.out.println();
                            System.out.println("FAILED!");
                            System.out.println("Logare esuata!");

                        }
                        else {
                            System.out.println(URL2);
                            F += 1;
                            System.out.println("======================================================================");
                            System.out.println();
                            System.out.println("FAILED!");
                            System.out.println("Butonul pentru pagina de Twitter/Facebook/Linkedin NU functioneaza in parametri ok!");
                        }
                        System.out.println("Total tests run: " + (P + F) + ", Passes: " + P + ", Failures: " + F);
                        System.out.println();
                        System.out.println("======================================================================");
                    }
                }
            }
        }
        else if (q1 == 5) {
            System.out.println("Ce user doriti sa utilizati pentru test?");
            System.out.println("1. standard_user");
            System.out.println("2. locked_out_user");
            System.out.println("3. problem_user");
            System.out.println("4. performance_glitch_user");
            System.out.println("5. Toate");
            int user = Scan();
            switch (user) {
                case 1 -> Menu(1);
                case 2 -> Menu(2);
                case 3 -> Menu(3);
                case 4 -> Menu(4);
            }
        }
    }

}

