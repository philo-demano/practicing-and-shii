def main():
    print("Bitte Temperatur eingeben: ")
    given_temp = int(input())
    given_type = input()

    new_temp = 0
    new_sign = ''
    if given_type == 'K' and given_temp < 0:
        print('ungueltiges input eingegeben')
    elif given_type == 'C' and given_temp < -273.15:
        print('ungueltiges input eingegeben')
    else :
        if given_type == 'K':
            new_temp = given_temp - 273.15
            new_sign = 'C'
            print(f"Das neuw Temperatur ist {new_temp} {new_sign}")
        elif given_type == 'C':
            new_temp = given_temp +273.15
            new_sign = 'K'
            print(f"Das neuw Temperatur ist {new_temp} {new_sign}")
        else:
            print("Etwas stimmt nicht!!")

if __name__ =='__main__':
    main()
