FROM sonatype/nexus:latest

MAINTAINER Michael Melsen <michael.melsen@itris.nl>

ENV SONATYPE_WORK /sonatype-work

USER root
COPY conf/nexus.xml ${SONATYPE_WORK}/conf/nexus.xml
RUN chown -R nexus ${SONATYPE_WORK} && \
    chmod -R ugo+rw ${SONATYPE_WORK}

USER nobody
