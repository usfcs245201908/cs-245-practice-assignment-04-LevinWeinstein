import sys

#filename should be first arg

if (len(sys.argv) < 2):
    print("Usage: python3 reformatter.py ${dataFileName}")
    sys.exit(1)


data_file = open(sys.argv[1])
algorithms_as_keys = {}
test_array_sizes = set()

for line in data_file:
    split = line.split()
    if len(split) == 5:
        algorithm_name = split[0]
        runtime = int(split[1])
        test_array_sizes.add(int(split[3]))

        if algorithm_name not in algorithms_as_keys:
            algorithms_as_keys[algorithm_name] = []
        algorithms_as_keys[algorithm_name].append(runtime)

    algorithms_as_keys["arraysize"] = sorted(list(test_array_sizes))

data_file.close()

output_file = open("reformatted_data.csv", "w+")

next_line = ""
for key in sorted(algorithms_as_keys):
    next_line += key + '\t'
print(next_line.strip(), file=output_file)

for i in range(len(test_array_sizes)):
    next_line = ""
    for key in sorted(algorithms_as_keys):
        next_line += str(algorithms_as_keys[key][i]) + "\t"
    print(next_line.strip(), file=output_file)

output_file.close()
