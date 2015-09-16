f = open("applicantDetails.txt", "r+")
newarr = []
for eachline in f:
	newarr.append(eachline.split(", "))

for eachElement in newarr[6]:
	print eachElement
f.close()