@echo off
color 01
set captchaPath=%RimontOS%\captcha\captcha.cmd
title  
goto BOOTLOADER



:BOOTLOADER
cls
echo ==============================
echo           BOOTLOADER      
echo.    
echo  1. Boot from Rimont OS
echo  2. Shutdown
echo  3. Reboot
echo  4. Command Prompt
echo.
echo           BOOTLOADER          
echo ==============================
choice /c 1234 /n
cls
if %errorlevel%==1 goto bootRimontOS
if %errorlevel%==2 goto turnOff
if %errorlevel%==3 goto reboot
if %errorlevel%==4 goto cmd

echo.
echo.
echo Invalid choice
echo Press any key to return
pause >nul
cls
goto BOOTLOADER

:cmd

cls
echo Type "exit" to exit the cmd
echo.
echo.
prompt RimontOS/
cmd
echo.
echo.
echo Press "e" key to exit the cmd
choice /c e /n
cls
if %errorlevel%==1 goto BOOTLOADER

:bootRimontOS
cls
echo Please select the mode in which you want to boot your system
echo.
echo 1. Normal mode (Recommended)
echo 2. Command prompt
echo 3. Safe mode
echo 4. Return to bootloader
choice /c 1234 /n
if %errorlevel%==1 goto RimontOS
if %errorlevel%==2 goto cmd
if %errorlevel%==3 goto working
if %errorlevel%==4 goto BOOTLOADER
echo.
echo.
echo Invalid choice
echo Press any key to return to bootloader
pause >nul
cls
goto BOOTLOADER

:RimontOS
start /max "" "%captchaPath%"
exit

:working
echo We're sorry, but we're currently working at this feature. Please come back later.
echo Press any key to return to bootloader.
pause >nul
cls
goto BOOTLOADER


:reboot
cls
ping -n 3 127.0.0.1 >nul
echo _
ping -n 2 127.0.0.1 >nul
cls
ping -n 2 127.0.0.1 >nul
echo _
ping -n 3 127.0.0.1 >nul
cls
ping -n 4 127.0.0.1 >nul
cls
goto BOOTLOADER

:turnOff
cls
echo Are you sure you want to turn off your computer? (Y/N): 
choice /c yn /n
if %errorlevel%==1 goto shutdownTrue
if %errorlevel%==2 goto shutdownFalse

echo.
echo.
echo Invalid choice
echo Press any key to return
pause >nul
cls
goto turnOff

:shutdownFalse
cls
goto BOOTLOADER

:shutdownTrue
exit
