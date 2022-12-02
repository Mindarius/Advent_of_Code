import os
from datetime import date
import sys
fileName=os.path.abspath(__file__).split('\\')
sys.path.append('\\'.join(fileName[:-2]))
import InputFetcher
inp_file_name='\\'.join(fileName[:-1]+["inputs",fileName[-1][3:-5]+".txt"])
if not os.path.isfile(inp_file_name):
    InputFetcher.run(date(day=int(fileName[-1][3:-5]), month=12, year=int(fileName[-2])))
inp_file=open(inp_file_name)
inp=inp_file.read()
inp_file.close()


elf="ABC"
me="XYZ"
points = 0
for round in inp.split('\n'):
    E,M=round.split()
    print(round)
    if M=='X':
        points+=1+(elf.index(E)+2)%3
    elif M=='Y':
        points+=1+3+elf.index(E)
    else:
        points+=6+1+(elf.index(E)+1)%3
    print(points)
print(points)