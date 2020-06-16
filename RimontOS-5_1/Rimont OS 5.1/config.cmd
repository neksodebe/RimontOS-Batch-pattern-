@echo off
title RimontOS Configuration
color 01
goto config


:config
echo Paste here the path of this directory (folder) \/ \/ \/
set /p thispath=">> "
setx RimontOS /m "%thispath%"
cls
echo Configuration successfully completed. Press any key to start RimontOS
pause >nul
goto start


:start
cls
echo Completing configuration.
ping -n 5 127.0.0.1 >nul
cls
echo Saving the System Variable..
ping -n 5 127.0.0.1 >nul
cls
echo Configuration is almost complete...
ping -n 4 127.0.0.1 >nul
cls
echo Configuration complete
exit