# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"

#HOMEPAGE = "http://osrf-pycommon.readthedocs.org/"
#SUMMARY = "Commonly needed Python modules, used by Python software developed at OSRF"

SRC_URI = "git://github.com/ros/class_loader.git;protocol=https;branch=ros2;"
SRCREV = "bc6f6311fe1970c29bc5e137bf65c5125329b741"

DEPENDS += "console-bridge ament-cmake poco"

S = "${WORKDIR}/git"

inherit ament
