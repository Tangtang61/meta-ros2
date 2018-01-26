# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ament/ament_cmake/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "056709a3d7d6c378cd704e95690d462f"
SRC_URI[sha256sum] = "71ac986ac774d98309e59d570578e894634b1068811baec4832b8388b06bb25a"

S = "${WORKDIR}/ament_cmake-${PV}"
inherit ament

#FILES_${PN} += "/opt/ros2/"
