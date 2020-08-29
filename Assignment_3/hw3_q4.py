days = int(input("How many days are you getting pennies for pay?: "))
t = 0
total = 0

for i in range(1, (days + 1)):
    pay = ((.01)*(i*2))
    print ("Day | Pay") 
    print ("---------")
    print (i, "|", pay)
    print ("----------")
    t = t + pay

total = g = float("{0:.2f}".format(t))

print (f'The total pay you have recieved is: ${total}!')
    
    