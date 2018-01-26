# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "ament-tools"

SRC_URI = "https://github.com/ros2/launch/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "bb1f47d26ccb05ef73f001609267aa05"
SRC_URI[sha256sum] = "6081508e5d3b2500b0025f3baf9ae3bc7c1d35c51e903bed40ac14dba53b5865"

S = "${WORKDIR}/launch-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
