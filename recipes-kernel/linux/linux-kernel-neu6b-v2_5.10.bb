SECTION = "kernel"
DESCRIPTION = "Linux-5.10 ECM BSP kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

require recipes-kernel/linux/linux-yocto.inc

inherit kernel

SRC_URI = " \
	git://git@github.com/edgeble/kernel.git;protocol=ssh;branch=linux-5.10-gen-rkr4.1-v2 \
	file://${THISDIR}/files/cgroups.cfg \
	file://${THISDIR}/files/disable-broadcom-wlan.cfg \
"

SRCREV = "05727fe29f7d7097457b8d5a422d78fefb5e51ec"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

DEPENDS += "openssl-native util-linux-native"