################################################
# $Id: profile,v 1.2 2010/07/09 04:40:28 rml Exp $
# - prototype .rc for Borne shell and its derivatives
public=${public:-/public}
[ -r $HOME/.acms.debug ] && echo ENTERING .profile >&2

#  /public/profile - Default ACMS .profile file

# Your .profile file is processed each time a new Bourne shell ("bash" or
# "sh") is initialized.  In the case of a login shell, the initialization
# is done by processing files in the following order:

#  /etc/profile
#  /etc/profile.d/*.sh (sourced in lexically sorted order)
#  ${HOME}/.bash_profile
#  ${HOME}/.bash_login
#  ${HOME}/.profile (only if ${HOME}/.bash_profile was not found)

# On ACMS Linux systems, PATH is initially set by /etc/profile
# and then modified by the script fragments in /etc/profile.d/*.csh.
 
# All the usual profile setup is done by the following line.  Any additions
# you make should come after it.
[ -r $public/profile.adjunct ] && . $public/profile.adjunct
 
# CAUTION: if you choose to make adjustments to PATH,
# it is usually advisable to *add* to the existing PATH
# rather than resetting PATH completely.  By adding, there
# is less chance of inadvertently losing important elements.
# For example:  
#                  export PATH=$PATH:${HOME}/bin
#
# As of July 2010, the "Modules" package is installed, and used to establish
# your initial PATH, and to modify your PATH as required when you use "prep".
# We suggest using the "modules" package to modify your path.  For example,
# to prepend your ~/bin directory to PATH:
#	% module load my
# or, to remove the "tex" and "acroread" components of PATH (and MANPATH):
#	% module unload acroread tex
# You may still modify your path the traditional way, but using "modules"
# is infinitely easier for making dynamic changes.  To see which modules
# are in use, issue the command "module list";  for more info, "module help".

[ -r $HOME/.acms.debug ] && echo EXITING .profile >&2

