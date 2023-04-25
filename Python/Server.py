import sys

# Do not modify the add() function
def add(lhs, rhs):
    return lhs + rhs

# Do not modify the divide() function
def divide(lhs, rhs):
    if rhs == 0:
        raise Exception()
    return lhs / rhs

# Do not modify the echo() function
def echo(msg):
    return "You said '" + str(msg) + "'!'"

# Begin your server implementation here
def main():
    # Put your code here
    pass

if __name__ == '__main__':
    sys.exit(main())
