# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rcutils/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "a819834b1c9eb2befcdfbb9bec211d15"
SRC_URI[sha256sum] = "2464f7f6193baf11e000cfb0a4420446f68fac632e09d07a74da82595b2b4cf9"

DEPENDS = "ament-cmake"

S = "${WORKDIR}/rcutils-${PV}"

inherit ament python3-dir

FILES_${PN} += "/opt/ros2/"
