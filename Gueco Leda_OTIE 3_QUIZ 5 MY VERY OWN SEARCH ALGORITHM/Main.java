package com.gdstruc.module6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int TOTAL_ROUNDS = 30;
    private static final int TOTAL_HINTS = 3;
    private static final int MAX_POINTS = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Game> games = new ArrayList<>();

        // Game dataset
        games.add(new Game("Fortnite", "Winning is not always about having the best aim. Sometimes, building something before getting eliminated is just as important.", "Battle Royale", "PC, PlayStation, Xbox, Nintendo Switch", "Players can build structures while fighting."));
        games.add(new Game("Minecraft", "There are no real limits to what you can make, but surviving your first night might be harder than expected.", "Sandbox", "PC, PlayStation, Xbox, Nintendo Switch, Mobile", "Players can build, craft, and explore."));
        games.add(new Game("Roblox", "One day you could be running a business, the next you could be escaping a disaster or playing a horror game.", "Sandbox", "PC, Xbox, Mobile", "Players can create and play games made by others."));
        games.add(new Game("R.E.P.O.", "You are sent to collect things that are worth a lot, but getting them out safely is a completely different problem.", "Horror", "PC", "Players use physics-based tools to collect objects."));
        games.add(new Game("PEAK", "The destination is clear, but getting there with your friends is where everything starts going wrong.", "Adventure", "PC", "Players climb a mountain together."));
        games.add(new Game("Don't Starve Together", "The world does not exactly care if you are prepared or not. Every day brings another reason to stay alive.", "Survival", "PC, PlayStation, Xbox, Nintendo Switch", "Players must survive through changing seasons."));
        games.add(new Game("Mobile Legends: Bang Bang", "Five people enter one battlefield, but one mistake can give the other team the advantage.", "MOBA", "Mobile", "Players choose heroes with different abilities."));
        games.add(new Game("Dark Deception", "Collecting what you need sounds simple until you realize that something is always following you.", "Horror", "PC, PlayStation, Xbox, Nintendo Switch", "Players collect soul shards while avoiding monsters."));
        games.add(new Game("Cult of the Lamb", "A creature that should probably be worried about its own survival suddenly becomes responsible for everyone else's beliefs.", "Roguelike", "PC, PlayStation, Xbox, Nintendo Switch", "Players build and manage a cult."));
        games.add(new Game("DREDGE", "The things you find might be valuable, but not everything you discover should have been found in the first place.", "Adventure", "PC, PlayStation, Xbox, Nintendo Switch", "Players operate a fishing vessel and uncover cosmic horror secrets."));
        games.add(new Game("TOEM", "Not every problem needs a weapon or a fight. Sometimes, looking at things from a different angle is enough.", "Adventure", "PC, PlayStation, Nintendo Switch", "Players take photographs to solve problems."));
        games.add(new Game("Risk of Rain 2", "Taking your time might seem like the safest option, but waiting too long can make everything much harder.", "Roguelike", "PC, PlayStation, Xbox, Nintendo Switch", "Players fight increasingly difficult enemies."));
        games.add(new Game("Supermarket Together", "A simple shopping trip becomes a lot more complicated when you are the ones responsible for the entire store.", "Simulation", "PC", "Players manage a supermarket with friends."));
        games.add(new Game("RV There Yet?", "Getting from one place to another should be easy, but the road seems to have other plans for your group.", "Adventure", "PC", "Players travel together in an RV."));
        games.add(new Game("Phasmophobia", "Some places have strange activities that cannot be explained by simply checking if someone is inside.", "Horror", "PC, PlayStation, Xbox", "Players identify ghosts using investigation equipment."));
        games.add(new Game("Poppy Playtime", "A place that once made things for children is now somewhere you probably would not want to visit alone.", "Horror", "PC, PlayStation, Xbox, Mobile", "Players use a special grabpack to interact with objects."));
        games.add(new Game("Shift at Midnight", "Working late is already tiring, but dealing with customers who might not be what they appear to be makes it worse.", "Horror", "PC", "Players must identify suspicious customers."));
        games.add(new Game("Dressmaker", "Not everything is about winning or surviving. Sometimes the challenge is making something that actually looks good.", "Simulation", "PC", "Players create and customize outfits."));
        games.add(new Game("Fields of Mistria", "Starting somewhere new means learning how things work, meeting people, and slowly building a life of your own.", "Simulation", "PC", "Players farm, fish, and build relationships."));
        games.add(new Game("No, I'm Not a Human", "Someone is standing outside asking to come in, but letting the wrong person enter could be a serious mistake.", "Horror", "PC", "Players decide who is human and who is not."));
        games.add(new Game("Amanda the Adventurer", "Something that looks like an ordinary children's program starts acting strangely when you pay closer attention.", "Horror", "PC, Nintendo Switch", "Players interact with videotapes and solve puzzles."));
        games.add(new Game("Fishbowl", "Sometimes the biggest part of moving forward is dealing with things that you have been keeping for a long time.", "Adventure", "PC", "Players organize memories and complete daily tasks."));
        games.add(new Game("Overcooked 2", "Everyone has a job to do, but having too many things happening at once can turn a simple task into chaos.", "Party", "PC, PlayStation, Xbox, Nintendo Switch", "Players prepare and serve food together."));
        games.add(new Game("Clash Royale", "You have limited resources and only a few moments to decide what to send out before the other side reacts.", "Strategy", "Mobile", "Players deploy troops and spells to destroy towers."));
        games.add(new Game("Brawl Stars", "Different characters enter short matches, each with their own way of fighting and helping their team.", "Action", "Mobile", "Players compete in several game modes."));
        games.add(new Game("Plants vs. Zombies", "The things protecting your home are not exactly what you would expect to find in an ordinary garden.", "Tower Defense", "PC, Mobile", "Players use plants to defend against zombies."));
        games.add(new Game("Fears to Fathom", "What starts as an ordinary situation can become something terrifying when you realize you are not alone.", "Horror", "PC", "Each episode tells a different psychological horror story."));
        games.add(new Game("Mortal Kombat 11", "Some disagreements are settled through combat, and the ending is usually much more brutal than the fight itself.", "Fighting", "PC, PlayStation, Xbox, Nintendo Switch", "Players perform special moves and Fatalities."));
        games.add(new Game("Tekken 7", "Family problems have never been this complicated, especially when almost everyone involved knows how to fight.", "Fighting", "PC, PlayStation, Xbox", "Players use combos and unique fighting styles."));
        games.add(new Game("The Quarry", "A group of people are supposed to enjoy their time together, but staying until morning becomes the real challenge.", "Horror", "PC, PlayStation, Xbox", "Player choices affect who survives."));
        games.add(new Game("God of War Ragnarok", "A father and son travel through unfamiliar places while dealing with problems much bigger than their own.", "Action", "PlayStation, PC", "Players control Kratos and use the Leviathan Axe."));
        games.add(new Game("Injustice 2", "Imagine a world where familiar heroes no longer agree on what is right, and they settle their differences through combat.", "Fighting", "PC, PlayStation, Xbox", "Players battle using DC characters."));
        games.add(new Game("Cuphead", "Everything looks like it came from an old cartoon, but the experience is definitely not as easy as it looks.", "Platformer", "PC, PlayStation, Xbox, Nintendo Switch", "Players fight challenging boss battles."));
        games.add(new Game("Raft", "You start with almost nothing, and the things floating around you might be the only way to build something useful.", "Survival", "PC", "Players gather materials and expand their raft."));
        games.add(new Game("Subnautica", "There is an entire world below you, and not everything living there will be happy to see you.", "Survival", "PC, PlayStation, Xbox, Nintendo Switch", "Players explore an alien ocean."));
        games.add(new Game("Fall Guys", "Everyone is trying to reach the same goal, but the obstacles and other competitors make that harder than it sounds.", "Party", "PC, PlayStation, Xbox, Nintendo Switch", "Players compete in chaotic obstacle courses."));
        games.add(new Game("That's Not My Neighbor", "You are responsible for deciding who gets through the entrance, but looking familiar does not mean someone belongs there.", "Horror", "PC", "Players check documents to identify impostors."));
        games.add(new Game("Hades 2", "A journey through dangerous places involves powerful enemies, strange abilities, and a family with complicated history.", "Roguelike", "PC, Nintendo Switch", "Players use witchcraft and magical weapons."));
        games.add(new Game("Detroit: Become Human", "In a world where machines look and act like people, the difference between following orders and making choices becomes important.", "Adventure", "PC, PlayStation", "Player decisions shape multiple story paths."));
        games.add(new Game("The Last of Us", "The world has changed because of something spreading among people, and survival becomes more important than anything else.", "Action", "PlayStation, PC", "Players follow the journey of Joel and Ellie."));

        // Shuffle the games
        Collections.shuffle(games, random);

        // Select 30 games for the session
        ArrayList<Game> sessionGames =
                new ArrayList<>(games.subList(0, TOTAL_ROUNDS));

        LedaThreeHints searchAlgorithm = new LedaThreeHints();

        int totalScore = 0;
        boolean gameOver = false;

        System.out.println("=================================================");
        System.out.println("          Leda's Guess The Game");
        System.out.println(" Read the hints, think of games, guess and repeat");
        System.out.println("=================================================");

        // Start the 30 rounds
        for (int round = 1; round <= TOTAL_ROUNDS && !gameOver; round++) {

            Game mysteryGame = sessionGames.get(round - 1);
            ArrayList<Game> possibleGames = new ArrayList<>(sessionGames);

            System.out.println("\nRound " + round + " of " + TOTAL_ROUNDS);
            System.out.println("Can you identify the mystery game?");

            for (int hintNumber = 1; hintNumber <= TOTAL_HINTS; hintNumber++) {

                System.out.println("\nHint " + hintNumber + ":");
                System.out.println(mysteryGame.getHint(hintNumber));

                // Search through the possible games
                possibleGames = searchAlgorithm.search(possibleGames, mysteryGame, hintNumber);

                System.out.println("Remaining possible games: " + possibleGames.size());

                boolean wantsToGuess = false;

                if (hintNumber == TOTAL_HINTS) {
                    wantsToGuess = true;
                    System.out.println("\nThis is your final hint. You must guess!");
                } else {
                    System.out.print("\nDo you want to guess? (Yes/No): ");
                    String choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("Yes")) {
                        wantsToGuess = true;
                    } else if (choice.equalsIgnoreCase("No")) {
                        System.out.println("Here's another hint!");
                    } else {
                        System.out.println("Invalid choice. You will receive another hint.");
                    }
                }

                if (wantsToGuess) {

                    System.out.print("Enter your guess: ");
                    String guess = scanner.nextLine();

                    // Check the player's answer
                    if (guess.trim().equalsIgnoreCase(mysteryGame.getName().trim())) {

                        int points = MAX_POINTS - hintNumber + 1;
                        totalScore += points;

                        System.out.println("Correct! You earned " + points + " points!");
                    } else {

                        System.out.println("Incorrect!");
                        System.out.println("The correct answer was " + mysteryGame.getName());
                        System.out.println("Game Over! One wrong guess ends the game.");

                        gameOver = true;
                    }

                    break;
                }
            }
        }

        System.out.println("\n========================================");
        System.out.println("             GAME FINISHED");
        System.out.println("========================================");
        System.out.println("Your final score: " + totalScore + " / " + (TOTAL_ROUNDS * MAX_POINTS));

        if (gameOver) {
            System.out.println("You made an incorrect guess. Better luck next time!");
        } else {
            System.out.println("Congratulations! You completed all 30 rounds!");
        }

        scanner.close();
    }
}