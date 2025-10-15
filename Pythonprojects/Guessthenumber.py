import random

guess_number = random.randint(1,100)
player_guess = None


while player_guess != guess_number:
    player_guess = int(input("Enter your guess here: "))

    if player_guess < guess_number:
        print('too low')
    elif player_guess > guess_number:
        print('too high')
    else:
        print('Correct!!')



