# HW-4

name = input("Please enter your full name here!: ")

description = input("Please describe yourself here!: ")


# Create html file (webpage.html) as a txt file
def create():
    # Open a file named webpage.txt.
    outfile = open('webpage.txt', 'w')

   
    outfile.write('<html>\n')
    outfile.write('<head>\n')
    outfile.write('</head>\n')
    outfile.write('<body>\n')
    outfile.write('   <center>\n')
    outfile.write(f'<h1>{name}</h1>\n')
    outfile.write('   </center>\n')
    outfile.write('   <hr />\n')
    outfile.write(f'{description}\n')
    outfile.write('   <hr />\n')
    outfile.write('</body>\n')
    outfile.write('</html>\n')


    outfile.close()

# Calling function.
create()