list1 = [12,34,10,6,40]
smax=0;
max =0;
for i in range(0,len(list1)-1):
  if(list1[i] > max):
    smax = max;
    max =list1[i]
  

print(smax,' ',max)  