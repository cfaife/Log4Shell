# Log4Shell in deep detail with C language

## Requirements

  * GNU C Compiler

## Compile the program:
  
  `gcc main.c -o main`

## Testing

`./main some-text`
  
  The output should be `some-text`, this is a normal behavior.


  `./main %X`

  Prints memory address for some reason, this is where the vulnerability starts...

