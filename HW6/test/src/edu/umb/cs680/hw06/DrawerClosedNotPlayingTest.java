package edu.umb.cs680.hw06;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class DrawerClosedNotPlayingTest {
	
	private static DrawerClosedNotPlaying drawerclosed_notplaying = DrawerClosedNotPlaying.getInstance();
	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@Test
	public void test_OpenCloseButtonPushed() {
		drawerclosed_notplaying.openCloseButtonPushed();
		assertEquals(outContent.toString().replaceAll("\\s+", ""), "OpenOpen");
		
	}

	@Test
	public void test_PlayButtonPushed() {
		drawerclosed_notplaying.playButtonPushed();
		assertEquals(outContent.toString().replaceAll("\\s+", ""), "ClosePlay");
		
	}

	@Test
	public void test_StopButtonPushed() {
		drawerclosed_notplaying.stopButtonPushed();
		assertEquals(outContent.toString().replaceAll("\\s+", ""), "Alreadystopped");
	}

}
