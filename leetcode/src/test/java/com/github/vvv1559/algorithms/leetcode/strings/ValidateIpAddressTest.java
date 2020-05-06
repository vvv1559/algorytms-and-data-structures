package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidateIpAddressTest {

    public final ValidateIpAddress validateIpAddress = new ValidateIpAddress();

    @Test
    void validateV4() {
        assertEquals("IPv4", validateIpAddress.validIPAddress("172.16.254.1"));
        assertEquals("Neither", validateIpAddress.validIPAddress("172.16.254.01"));
        assertEquals("Neither", validateIpAddress.validIPAddress("256.256.256.256"));

        assertEquals("Neither", validateIpAddress.validIPAddress("172.16.254.1."));
        assertEquals("Neither", validateIpAddress.validIPAddress("172.16..254.1"));
        assertEquals("Neither", validateIpAddress.validIPAddress(".16.254.1.172"));
    }

    @Test
    void validateV6() {
        assertEquals("IPv6", validateIpAddress.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
        assertEquals("IPv6", validateIpAddress.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("IPv6", validateIpAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));

        assertEquals("Neither", validateIpAddress.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
        assertEquals("Neither", validateIpAddress.validIPAddress("2001:0db8:85a43:0000:0000:8a2e:0370:7334"));
    }
}