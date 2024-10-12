list1=[10,20,30,40,50]
sum=0
for i in list1:
  sum+=i

print("Sum is ", sum)
print("Avg is " , sum/len(list1))

list1.reverse()
print(list1)
l = len(list1)
while(l >=0):
  print(list1[l])