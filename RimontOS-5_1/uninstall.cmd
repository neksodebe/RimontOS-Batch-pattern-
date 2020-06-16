@echo off
title Uninstall Rimont OS
color 04
goto prompt

:prompt
echo Are you sure you want to uninstall Rimont OS? The following things will happen:
echo - Rimont OS's folder will get deleted
echo - The System Variable "RimontOS"
set /p choice="(Y/N): "
if %choice%==Y goto remove
if %choice%==y goto remove
if %choice%==N goto no
if %choice%==n goto no

:no
exit

:remove
@RD /S /Q "%RimontOS%"
setx RimontOS ""
