# Question 3: Color Mixer

primarycolor_1 = input("Please enter one of the three primary colors {red, yellow, or blue}:  ")

primarycolor_2 = input("Please enter a second color from the primary colors {red, yellow, or blue}:  ")

if (primarycolor_1  not in ['red', 'yellow', 'blue']) or (primarycolor_2 not in ['red', 'yellow', 'blue']):
    print("ERROR!! Please enter a primary color! The primary colors are Red, Yellow, or Blue")
          
        
elif (primarycolor_1 == 'red' and primarycolor_2 == 'blue'):
    print("The secondary color you made is purple!")
elif (primarycolor_1 == 'blue' and primarycolor_2 == 'red'):
    print("The secondary color you made is purple!")
elif (primarycolor_1 == 'red' and primarycolor_2 == 'yellow'):
    print("The secondary color you made is orange!")
elif (primarycolor_1 == 'yellow' and primarycolor_2 == 'red'):
    print("The secondary color you made is orange!")
elif (primarycolor_1 == 'blue' and primarycolor_2 == 'yellow'):
    print("The secondary color you made is green!")
elif (primarycolor_1 == 'yellow' and primarycolor_2 == 'blue'):
    print("The secondary color you made is green!")
    
    
    
        