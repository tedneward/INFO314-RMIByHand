def add(lhs, rhs):
    return -1

def divide(lhs, rhs):
    return -1

def echo(msg):
    return -1

# --------------------------------------------
# The following exercises the remote calls
# and should not need modification

print("Starting Client...")
if (add(2, 4) == 6):
    print(".")
else:
    print("X")

try:
    divide(1, 0)
    print("X")
except Exception:
    print(".")


if echo("Hello") == "You said Hello!":
    print(".")
else:
    print("X")

print(" Finished")
