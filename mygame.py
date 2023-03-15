import random

class Game :


    def set_Name(self):
        name = input("Please Type Your Name ")
        print("Welcome to the game{name}")
        
    def  set_Team(self):
        n = int(input("Input any number from 1-10"))

        if(n<5):

            print("Welcome to the Red team ")
        else:

             print("Welcome to the Blue team ")
        
            

         
       
          

    def rock_paper_scissors(self):
        

        cont = True

        while cont ==True:


            user_handActions = input("Type your choice(rock, paper, scissors): ")

            possible_handActions = ["rock","paper","scissors"]

            game_handActions = random.choice(possible_handActions)

            print(f"\nYou Chose {user_handActions}, computer chose {game_handActions}.\n ")


            if user_handActions == game_handActions:

                print(f"Both selected{user_handActions}. Tie!!")

            elif user_handActions == "rock":

                if game_handActions == "scissors":

                    print("Rock will smash Scissors! Yep You win !!" )
                else:

                    print("Paper covers rock! Sorry You Lose.")


            elif user_handActions == "scissors":

                if game_handActions == "papers":

                    print("Scissors cuts paper! You win!!")
                else :

                    print("Rock will smash Scissors! You Lose")


            elif user_handActions == "paper":

                if game_handActions == "rock":

                    print("Paper covers rock! You Win!!")
                else :

                    print("Scissors cuts paper! You lose")


        play_again = input("Play Again? (y/n): ")       

        if play_again.lower() != "y":

            cont = False


        


Object = Game()

while True:


    print("Game profiler")

    print("Choose what to do")

    operation_dictionary = {"SetName": 1, "SetAvatar" : 2, "Rock,Paper,Scissor" : 3, "Quit": 4  }

    for k in operation_dictionary:

        print("Activity: {} -> button:{}".format(k,operation_dictionary[k]))   
    

    choice = int(input("Choose Button"))
    

    if  choice == 1:

        Object.set_Name()

    elif choice == 2:

       Object.set_team()   

    elif choice == 3:

        Object.rock_paper_scissors()

    elif choice == 4:
        break
    else:
        print("Invalid")