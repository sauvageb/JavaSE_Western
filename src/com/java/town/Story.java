package com.java.town;

import com.java.town.model.*;

public class Story {

    public static void main(String[] args) {
        Sherif sherif = new Sherif("Ludovic Arn");
        Brigand brigand = new Brigand("Stanford", "borgne");
        Barman barman = new Barman("Edgard", "La Cocotte Plumée");
        Lady lady = new Lady("Amelia", "bleu emeraude");

        Cowboy cowboy = new Cowboy("Willam Strom");

        CrookedCop sherifDeputy = new CrookedCop("Norbert");
        LadyBrigand ladyBrigand = new LadyBrigand("Calamity Jane", "marron");
        Indian indian = new Indian("Petit Castor", 3);

        System.out.println("");
        System.out.println("ACTE I");

        naration("Nous sommes en 1865, dans une petite bourgarde de l'Ouest américain, Bienvenu à Black River City...");
        naration("Grâce au valeureux " + sherif.getName() + ", une atmosphère paisible régne dans toute la vallée ...");
        naration("Seulement, ce matin là, Une voix puissante retenti dans les rues lointaines ! ");
        sherif.lookingFor(brigand);
        sherif.introduce();
        naration("Ce matin, une terrible rumeur ébranle le calme paisible de Black River City : Un brigand recherché est planqué dans le village...");

        System.out.println("");
        System.out.println("ACTE II");

        naration("Plus loin, renfoncé dans les rues de Black Rivier City, un homme rentre dans le bar");
        naration("Tout le monde se figea, fixant " + brigand.getName() + ". Qui es-ce ? Que viens-t-il faire ici ?");

        barman.introduce();
        naration("Le silence. Puis..cet homme, étrange, s'exclama");
        brigand.introduce();

        naration("Une des courtisannes descend les escaliers en se pavanant");
        lady.speak("Bonjour " + brigand.getName() + " !");

        lady.introduce();
        lady.changeDress("rouge");
        lady.speak("un verre je vous prie " + barman.getName());
        lady.drink();

        naration(brigand.getName() + " se tourne vers elle, le regard envieux ! ");
        brigand.kidnap(lady);

        System.out.println("");
        System.out.println("ACTE III");
        naration("Au même moment, un grand homme blond entre dans le bar et s'exclame.");

        cowboy.introduce();
        cowboy.speak("Qui etes vous donc ?");

        brigand.speak("Cette femme est la mienne!!! ce ne sont pas vos affaires, " + cowboy.getName() + " !");
        lady.speak("Mais svp !! Sauvez moi " + cowboy.getAdjective());
        cowboy.speak(" Je vais vous sauver " + lady.getName());


        cowboy.shoot(brigand);

        System.out.println("");
        System.out.println("ACTE IV");
        naration("La porte battante du saloon claque, et un homme surgit.");
        sherif.speak("Que se passe-t-il ici ?! qui trouble le calme de ma belle ville ?");
        cowboy.speak("Ce malotru, " + brigand.getName() + " " + " a enlevé " + lady.getName());

        naration("Le shérif se tourna vers " + brigand.getName());
        sherif.capture(brigand);
        cowboy.release(lady);
        lady.speak("Vous m'avez sauvé " + cowboy.getAdjective() + " " + cowboy.getName() + ". Je vous serais toujours reconnaissante! Je vous invite à boire un verre !");
        lady.drink();
        cowboy.drink();

        System.out.println("");
        System.out.println("ACTE V");
        System.out.println("Il était une deuxième fois...");
        naration("Tout est redevenu calme sur Black River City, avec quelques changements..");
        cowboy.introduce();
        lady.changeDress("violette");
        brigand.introduce();
        sherif.introduce();

        naration("Mais après une altercation devant la prison, l'adjoint shérif débarqua !");
        ((Sherif) sherifDeputy).introduce();
        ladyBrigand.introduce();
        sherifDeputy.capture(ladyBrigand);

        naration(sherifDeputy.getName() + " se dirige dans la prison pour enfermer " + ladyBrigand.getName());
        naration("Sauf que ! l'adjoint du " + sherif.getName() + " n'était pas blanc comme neige !");
        naration("Une fois devant les cellules..Il inversa sa veste !");
        sherifDeputy.introduce();
        naration("Il ouvra la porte des cellules...");
        sherifDeputy.release(ladyBrigand, brigand);

        System.out.println("");
        System.out.println("ACTE VI");
        naration("Une fois dehors, un indien était là, devant le bureau du Shérif, un verre à la main");
        sherif.speak("Qui es-tu ?? Que nous veux-tu ?");
        indian.speak("Visages pale, traîte, moi scalper toi !!!!");
        indian.scalp(sherif);

        naration(sherif.getName() + " mourut sur le coup. Attiré par les hurlements, les autres sortirent rapidement !");
        sherifDeputy.speak("Hey toi !! Qu'as-tu fais à " + sherif.getName() + " ??");
        ladyBrigand.speak("Oh !!");
        indian.speak("Vous aussi, traîtes, moi scalper vous !!!!");
        brigand.speak("Hein ?!!");
        indian.scalp(ladyBrigand);
        indian.scalp(brigand);
        indian.scalp(sherifDeputy);
        naration(ladyBrigand.getName() + ", " + brigand.getName() + " et " + sherifDeputy.getName() + " moururent sur le coup ! Et au loin on entendi les hurlement de son totem le "
                + indian.getTotem() + ".");

        naration("Aussitôt, Black river retrouva son calme... Mais cette fois..sans Shérif. Seriez-vous intéressé ?!");
    }

    public static void naration(String naration) {
        System.out.println("\u001B[33m" + naration + "\u001B[0m");
    }
}
