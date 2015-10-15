f = open("a.txt", "r+")
newarr = []
for eachline in f:
	newarr.append(eachline.split(", "))

for eachElement in newarr[0]:
	print eachElement
f.close()


# f = open("a.txt", "r+")
# newarr = []
# for eachline in f:
# 	eachline = eachline.replace(", ", "--")
# 	eachline = eachline.replace(",,", ",NULL,")
# 	newarr.append(eachline.split(","))

# for eachElement in newarr[0]:
# 	print eachElement
# f.close()