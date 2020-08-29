# Question 2: Age Qualifier

age = int(input("Please enter the age of the person in question:  "))

if (age <= 1):
    print("This person is an infant")
elif (age > 1 and age < 13):
    print("This person is a child")
elif (age >= 13 and age < 20):
    print("This person is a teenager")
elif (age >= 20):
    print("This person is an adult")
    