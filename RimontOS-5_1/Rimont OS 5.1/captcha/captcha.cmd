@echo off
set desktopPath=%RimontOS%\GUI\desktop.cmd
title Complete the captcha to continue
color c
goto start

:start
type lg1.exe
ping -n 3 127.0.0.1 >nul                                
cls                                     
goto captcha

:captcha
cls

set /a one=%RANDOM%

goto completing

:completing
cls
echo Complete the captcha to continue
echo Type the following number below: %one%
echo.
echo Type "new" to create a new captcha
echo.
set /p typed=">> "
if %typed%==%one% goto true
if %typed%==new goto captcha

echo.
echo Invalid captcha
echo.
echo Press any key to try again
pause >nul
goto completing

:true
echo.
echo Captcha completed!
echo.
pause
goto startUser

:startUser
start /max "" "%desktopPath%"
exit
