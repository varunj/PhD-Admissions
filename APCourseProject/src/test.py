f = open("applicantDetails.txt", "r+")
newarr = []
for eachline in f:
	newarr.append(eachline.split(", "))

for eachElement in newarr[0]:
	print eachElement
f.close()