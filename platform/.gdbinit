# GDB setup file for debugging SWI-Prolog

# Break on fatal errors and intended traps

set breakpoint pending on
break trap_gdb
break sysError
break fatalError
set breakpoint pending off

# Pass `normal signals'

handle SIGPIPE noprint nostop pass
handle SIGUSR1 noprint nostop pass
handle SIGUSR2 noprint nostop pass
handle SIGINT print nostop pass
handle SIGTTOU pass nostop noprint
handle SIGABRT stop print nopass
handle SIGTSTP nopass stop print

set backtrace past-main on

set backtrace past-entry on
set backtrace limit unlimited

define tbt
  thread apply all backtrace
end

#catch signal SIGSEGV
#commands bt continue

handle SIGSEGV stop print nopass

set print thread-events on
set print thread-events off

# Some common ways to start the system with the test-suite loaded

define pl
  dont-repeat
  run -f test.pl -O -F none
end

define qpl
  dont-repeat
  run -q -f ../src/test.pl -O -F none
end

define test
  dont-repeat
  run -q -f ../src/test.pl -O -F none -g test,halt -t 'halt(1)'
end

define boot
  dont-repeat
  run -O -o pl.prc -b ../boot/init.pl
end

# Run under the efence memory debugger

define ef
#  set environment LD_PRELOAD=libefence.so.0.0
end

# Set home, so we can run libraries from the packages.  edit to
# suit your installation

define public
#  set environment SWI_HOME_DIR=/home/jan/lib/swipl
end

run
# thread apply all bt full
print $_exitcode
quit $_exitcode

