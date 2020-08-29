budget = float(input("What is the total budget allowed?  "))

total = 0

expensenum = int(input("How many expenses will you be entering for the month?: "))

for i in range (1, (expensenum + 1)):
    expense = float(input(f'What is the expense for expense no. {i}?: '))
    total = total + expense    

remainder = (budget - total)
print (f'The total remaining money of the whole year is {remainder}!')