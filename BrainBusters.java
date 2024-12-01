
package brainbusters;

import java.util.Scanner;
public class BrainBusters {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        String text = "BRAIN BUSTERS";
        int width = text.length() + 4;

        System.out.println("*".repeat(width));
        System.out.println("* " + text + " *");
        System.out.println("*".repeat(width));
        
        System.out.println("~~WELCOME TO BRAIN BUSTERS~~");
        System.out.println("Brain Busters is a fun, interactive game that mixes trivia, puzzles, and quick-thinking challenges.\nPlayers tackle themed levels filled with quizzes and brain-teasing mini-games\nto test their logic, memory, and problem-solving skills.");
        System.out.println();
        System.out.println("HOW TO PLAY THE GAME?\nChoose a category ~SCIENCE, PHILIPPINE HISTORY, GEOGRAPHY, MATH AND LOGIC~\nand tackle questions across three difficulty levels: EASY, MODERATE, and AVERAGE.\nEarn 1 point for easy level, 2 points for mderate and 3 point, with a maximum score of 30.\nTest your knowledge and aim for a perfect score. Good luck! ");
        System.out.println();
        
        
        int easyScore = 0;
        int moderateScore = 0;
        int averageScore = 0;
        
        int categoryChoice = Categories();
        
        
        System.out.println("Easy Level");
        easyScore = questions(categoryChoice, 1, 1);
        
        System.out.println();
        System.out.println("Moderate Level");
        moderateScore += questions(categoryChoice, 2, 2);
        
        System.out.println();
        System.out.println("Average Level");
        averageScore += questions(categoryChoice, 3, 3);
        
        int totalScore = easyScore + moderateScore + averageScore;
        
        System.out.println();
        System.out.println("Congratulations! You completed the task!");
        System.out.println();
        
        System.out.println("~~YOUR SCORE~~");
        System.out.println();
        System.out.println("Easy Level: " + easyScore);
        System.out.println("Moderate Level: " + moderateScore);
        System.out.println("Average Level: " + averageScore);
        System.out.println("You've got " + totalScore + " out of 30");
        
        if (totalScore >= 15) {
            System.out.println(" GOOD WORK! YOU'RE A GENIUS! :)");
            
        }else {
            System.out.println("BETTER LUCK NEXT TIME! :)");
        }
        
        System.out.println();
        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = sc.nextLine();
        if (playAgain.equalsIgnoreCase("yes")) { 
            main(args);
        } else {
            System.out.println("Thank you for playing!");
        }
 
    }

     
    public static int Categories() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick your category: 1. Science   2. Philippine History   3. Geography   4. Math and Logic");
        System.out.print("Enter category number: ");
        int categoryChoice = sc.nextInt();
        System.out.println();
        
        while (categoryChoice < 1 || categoryChoice > 4) {
            System.out.print("Invalid Category Number! Please pick only 1-4: ");
            categoryChoice = sc.nextInt();
        }
        return categoryChoice;
    
    }
    
    
    
    public static int questions(int categoryChoice, int Levels, int points) {
        int Score = 0;
        
        String[][][] questionList = {
            {//SCIENCE
                {"What is the hardest substance available on earth?\nA. Gold   B. Diamond   C. Platinum   D. Iron",
                    "Which planet is easily visible on earth?\nA. Mars   B. Jupiter   C. Neptune   D. Venus",
                    "Sound waves cannot travel through?\nA. Liquid   B. Gas   C. Vacuum   D. Solid",
                    "How many colors does a rainbow have?\nA. 7   B. 8   C. 9   D. 10",
                    "The energy value of food is measured in?\nA. Proteins   B. Tesla   C. Calories   D. Iron"},
                
                {"What is the unfavorable alteration of the environment due to human activities?\nA. Ecological Disturbance   B. Polution   C. Economic defradation  D. Catastrophe",
                    "Which is the biggest bird in the world?\nA. Ostrich   B. Eagle   C. Peacock   D. Chicken",
                    "Which of the following best conductor of electricity?\nA. Lemon juice   B. Sea Water   C. Apple juice   D. Pure water",
                    "Which of the following sea animals sleeps with one eye open?\nA. Dolphin   B. Shark   C. Whale   D. Fish",
                    "How many legs does butterfly have?\nA. 6   B. 8   C. 9   D. 10"},
                
                {"Element symbol of water.", "It is a branch of science known as the king of sciences as it help us understand the way nature works? ",
                    "What is the smallest particle of matter?", "Which color has the highest energy?", "What is the Appearance of the Earth's surface?"}
            },
            {//PHILIPPINE HISTORY
                {"What is the old name of the Philippines?\nA. Palawan   B. Agusan   C. Filipinas   D. Tacloban",
                    "Oldest city in the Philippines?\nA. Manila   B. Luzon   C. Tondo   D. Cebu", 
                    "Who was the first president of the Philippines?\nA. Manuel Quezon   B. Emilio Aguinaldo   C. Ramon Magsaysay   D. Ferdinand Marcos",
                    "Who was the first Filipino recording artist?\nA. Imelda Papin   B. Pilita Corales   C. Margi Moran   D. Maria Carpena",
                    "What is the oldest university in the Philippines?\nA. University of Santo Tomas   B. University of San Carlos   C. St. Mary's College   D. Universidad de Sta. Isabel"},
                
                {"In which year was Martial Law declared in the Philippines?\nA. 1972   B. 1965   C. 1986    D. 2016",
                    "How long did Spanish rule last in the Philippines?\nA. 297 years   B. 310 years   C. 333 years   D. 345 years",
                    "From which Spanish king did the Philippines take its name?\nA. Juan Carlos   B. King Philip I of Spain   C. King Philip II of Spain    D. King Charles II of Spain",
                    "Who was the 'Great Dissenter'?\nA. Jose Rizal   B. Sultan Dipatuan Kudarat   C. Apolinario Mabini   D. Claro M. Recto",
                    "Who designed the Rizal Monument?\nA. Carlos Nicoli   B. Antonio Luna    C. David Antel   D. Richard Kissling"},
                
                {"When was the Philippines discovered by Ferdinand Magellan?", "Who led the longest revolt against Spanish rule in Philippine history?", "What was the ancient script used in pre-colonial Philippines?", "Where did Ferdinand Magellan fight against Lapu-Lapu?", "Oldest city in the Philippines?"}
            },
            {//GEOGRAPHY
                {"What is the largest country in the world by area?\nA. Spain   B. Russia   C. USA   D. China",
                    "Which desert is the largest in the world?\nA. Sahara desert   B. Arabian Desert   C. Ogaden   D. Thar Desert",
                    "What mountain is the tallest in the world above sea level?\n Mount Fuji   B. MOunt Everest   C. Mount Apo   D. Half Dome",
                    "What is the longest river in Asia?\nA. Amur River   B. Indus RIver   C. Yellow River   D. Tangtze River",
                    "Which country is known as the Land of the Rising Sun?\nA. South Korea   B. Canada   C. Japan   D. China"},
                
                {"What is the name of the largest ocean on earth?\nA. Pacific Ocean   B. Atlantic Ocean   C. Indian Ocean Southern Ocean   D. Arctic Ocean",
                    "What is the capital of Japan?\nA. Tokyo   B. Kyoto   C. Sapporo   D. Nayoga",
                    "What is the capital of Italy?\nA. Milan   B. Rome   C. Florence   D. Turin",
                    "What is the capital of South Korea?\nA. Daegu   B. Busan   C. Seoul   Gwangyu   D. Ulsan",
                    "Which continent s the larges by land area?\nA. Asia   B. South America   C. Europe   D. Australia"},
                
                {"Which country is known as the Land of the Midnight Sun?",
                    "What is the name of the currency used in in Japan?",
                    "Which country has the most volcanoes in the world?",
                    "What is the capital of Japan?",
                    "What is the capital of the Philippines?"}
                    
            },
            {//MATH
                {"What is 12-4+3?\nA. 11   B. 34   C. 13   D.7",
                    "What is half of 50?\nA. 10   B. 42   C. 20.5   D. 25",
                    "If a clock shows 2:00 PM, what time will it be 3 hours later?\nA. 3:00 pm   B. 5:00 am   C. 5:00 pm   D. 7:34 pm",
                    "How many sides does a triangle have?\nA. 4   B. 3   C. 5   D. 2",
                    "If you have 5 candies and eat 2, how many are left?\nA. 3   B. 5   C. 2   D. 8"},
                
                {"A pizza is cut into 8 slices. If you eat 3, what fraction of the pizza is left?\nA. 4/5   B. 3/5   C. 5/8   D. 10/3",
                    "A Farmer has 17 sheep, and all but 9 run away. How many are left?\nA. 19   B. 32   C. 8   D. 5",
                    "What is 25x4?\nA. 50   B. 65   C. 100   D. 150",
                    "if 3 pen cost 15 pesos, how much does a pen cost?\nA. 5   B. 4   C. 8   D. 10",
                    "You are in a race and overtake the person in second place, What place are you in now?\nA. First   B. Second   C. Third   D. Fourth"},
                
                {"if x + 5 = 12, what is the value of x?", "A car travels 150km in 3 hours. What is its average apeed in km/h?", "What comes next in the sequence: 2,6,12,20,?", "Solve for y in 3y-2=16.", "A bad has 3 red balls, 5 bue balls, and 2 green balls. What is the probability of randomly picking a red ball?"}
    
            }
        };
        
        String[][][] Answers = {
            {
                {"B","D","C","A","C"},
                {"B","A","B","A","A"},
                {"H2O","Physics","Atom","Violet","Water"}
            },
            {
                {"C","D","B","D","A"},
                {"A","C","C","D","D"},
                {"1521","dagohoy","Alibata","Mactan","Cebu"}
            },
            {
                {"B","A","B","D","C"},
                {"A","A","B","C","A"},
                {"Norway","Yen","Indonesia","Tokyo","Manila"}
            },
            {
                {"A","D","C","B","A"},
                {"C","C","C","A","B"},
                {"7","50km","30","6","3/10"}
            }
        };
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + questionList[categoryChoice - 1][Levels - 1][i]);
            System.out.print("Your answer: ");
            String userInput = sc.next();
           
            if(userInput.equalsIgnoreCase(Answers[categoryChoice - 1][Levels - 1][i])) {
                System.out.println("Your answer is correct!");
                Score += points;
                
                
            }else {
                System.out.println("Your answer is wrong. The correct answer is " + Answers[categoryChoice - 1][Levels - 1][i]);
                
            }
           System.out.println();
        }
        return Score;
    }

   
}
