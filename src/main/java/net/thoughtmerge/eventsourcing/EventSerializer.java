/*
 * ------------------------------------------------------------------
 *             (C) Copyright 2013, EVAN GATES
 *                     ALL RIGHTS RESERVED
 *             THIS NOTICE DOES NOT IMPLY PUBLICATION
 * ------------------------------------------------------------------
 */
package net.thoughtmerge.eventsourcing;

/**
 *
 * @author evan.gates
 */
public interface EventSerializer {
  byte[] serializeEvents(Iterable<? extends Event> events);
  Iterable<Event> deserializeEvents(byte[] data);
}
