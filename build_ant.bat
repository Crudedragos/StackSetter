@echo off
echo -------------------------------- Building --------------------------------
set /p Input=Enter Version Number:
call ant -Dversion=%Input%
echo
echo -------------------------------- Finished --------------------------------
PAUSE