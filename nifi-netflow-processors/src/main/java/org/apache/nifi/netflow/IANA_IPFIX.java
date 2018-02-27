/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.netflow;

import java.util.HashMap;
import java.util.Map;

public enum IANA_IPFIX {
    customField(0, IANA_IPFIX_TYPES.octetArray),
    octetDeltaCount(1, IANA_IPFIX_TYPES.unsigned64),
    packetDeltaCount(2, IANA_IPFIX_TYPES.unsigned64),
    deltaFlowCount(3, IANA_IPFIX_TYPES.unsigned64),
    protocolIdentifier(4, IANA_IPFIX_TYPES.unsigned8),
    ipClassOfService(5, IANA_IPFIX_TYPES.unsigned8),
    tcpControlBits(6, IANA_IPFIX_TYPES.unsigned16),
    sourceTransportPort(7, IANA_IPFIX_TYPES.unsigned16),
    sourceIPv4Address(8, IANA_IPFIX_TYPES.ipv4Address),
    sourceIPv4PrefixLength(9, IANA_IPFIX_TYPES.unsigned8),
    ingressInterface(10, IANA_IPFIX_TYPES.unsigned32),
    destinationTransportPort(11, IANA_IPFIX_TYPES.unsigned16),
    destinationIPv4Address(12, IANA_IPFIX_TYPES.ipv4Address),
    destinationIPv4PrefixLength(13, IANA_IPFIX_TYPES.unsigned8),
    egressInterface(14, IANA_IPFIX_TYPES.unsigned32),
    ipNextHopIPv4Address(15, IANA_IPFIX_TYPES.ipv4Address),
    bgpSourceAsNumber(16, IANA_IPFIX_TYPES.unsigned32),
    bgpDestinationAsNumber(17, IANA_IPFIX_TYPES.unsigned32),
    bgpNextHopIPv4Address(18, IANA_IPFIX_TYPES.ipv4Address),
    postMCastPacketDeltaCount(19, IANA_IPFIX_TYPES.unsigned64),
    postMCastOctetDeltaCount(20, IANA_IPFIX_TYPES.unsigned64),
    flowEndSysUpTime(21, IANA_IPFIX_TYPES.unsigned32),
    flowStartSysUpTime(22, IANA_IPFIX_TYPES.unsigned32),
    postOctetDeltaCount(23, IANA_IPFIX_TYPES.unsigned64),
    postPacketDeltaCount(24, IANA_IPFIX_TYPES.unsigned64),
    minimumIpTotalLength(25, IANA_IPFIX_TYPES.unsigned64),
    maximumIpTotalLength(26, IANA_IPFIX_TYPES.unsigned64),
    sourceIPv6Address(27, IANA_IPFIX_TYPES.ipv6Address),
    destinationIPv6Address(28, IANA_IPFIX_TYPES.ipv6Address),
    sourceIPv6PrefixLength(29, IANA_IPFIX_TYPES.unsigned8),
    destinationIPv6PrefixLength(30, IANA_IPFIX_TYPES.unsigned8),
    flowLabelIPv6(31, IANA_IPFIX_TYPES.unsigned32),
    icmpTypeCodeIPv4(32, IANA_IPFIX_TYPES.unsigned16),
    igmpType(33, IANA_IPFIX_TYPES.unsigned8),
    samplingInterval(34, IANA_IPFIX_TYPES.unsigned32),
    samplingAlgorithm(35, IANA_IPFIX_TYPES.unsigned8),
    flowActiveTimeout(36, IANA_IPFIX_TYPES.unsigned16),
    flowIdleTimeout(37, IANA_IPFIX_TYPES.unsigned16),
    engineType(38, IANA_IPFIX_TYPES.unsigned8),
    engineId(39, IANA_IPFIX_TYPES.unsigned8),
    exportedOctetTotalCount(40, IANA_IPFIX_TYPES.unsigned64),
    exportedMessageTotalCount(41, IANA_IPFIX_TYPES.unsigned64),
    exportedFlowRecordTotalCount(42, IANA_IPFIX_TYPES.unsigned64),
    ipv4RouterSc(43, IANA_IPFIX_TYPES.ipv4Address),
    sourceIPv4Prefix(44, IANA_IPFIX_TYPES.ipv4Address),
    destinationIPv4Prefix(45, IANA_IPFIX_TYPES.ipv4Address),
    mplsTopLabelType(46, IANA_IPFIX_TYPES.unsigned8),
    mplsTopLabelIPv4Address(47, IANA_IPFIX_TYPES.ipv4Address),
    samplerId(48, IANA_IPFIX_TYPES.unsigned8),
    samplerMode(49, IANA_IPFIX_TYPES.unsigned8),
    samplerRandomInterval(50, IANA_IPFIX_TYPES.unsigned32),
    classId(51, IANA_IPFIX_TYPES.unsigned8),
    minimumTTL(52, IANA_IPFIX_TYPES.unsigned8),
    maximumTTL(53, IANA_IPFIX_TYPES.unsigned8),
    fragmentIdentification(54, IANA_IPFIX_TYPES.unsigned32),
    postIpClassOfService(55, IANA_IPFIX_TYPES.unsigned8),
    sourceMacAddress(56, IANA_IPFIX_TYPES.macAddress),
    postDestinationMacAddress(57, IANA_IPFIX_TYPES.macAddress),
    vlanId(58, IANA_IPFIX_TYPES.unsigned16),
    postVlanId(59, IANA_IPFIX_TYPES.unsigned16),
    ipVersion(60, IANA_IPFIX_TYPES.unsigned8),
    flowDirection(61, IANA_IPFIX_TYPES.unsigned8),
    ipNextHopIPv6Address(62, IANA_IPFIX_TYPES.ipv6Address),
    bgpNextHopIPv6Address(63, IANA_IPFIX_TYPES.ipv6Address),
    ipv6ExtensionHeaders(64, IANA_IPFIX_TYPES.unsigned32),
    mplsTopLabelStackSection(70, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection2(71, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection3(72, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection4(73, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection5(74, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection6(75, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection7(76, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection8(77, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection9(78, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection10(79, IANA_IPFIX_TYPES.octetArray),
    destinationMacAddress(80, IANA_IPFIX_TYPES.macAddress),
    postSourceMacAddress(81, IANA_IPFIX_TYPES.macAddress),
    interfaceName(82, IANA_IPFIX_TYPES.string),
    interfaceDescription(83, IANA_IPFIX_TYPES.string),
    samplerName(84, IANA_IPFIX_TYPES.string),
    octetTotalCount(85, IANA_IPFIX_TYPES.unsigned64),
    packetTotalCount(86, IANA_IPFIX_TYPES.unsigned64),
    flagsAndSamplerId(87, IANA_IPFIX_TYPES.unsigned32),
    fragmentOffset(88, IANA_IPFIX_TYPES.unsigned16),
    forwardingStatus(89, IANA_IPFIX_TYPES.unsigned32),
    mplsVpnRouteDistinguisher(90, IANA_IPFIX_TYPES.octetArray),
    mplsTopLabelPrefixLength(91, IANA_IPFIX_TYPES.unsigned8),
    srcTrafficIndex(92, IANA_IPFIX_TYPES.unsigned32),
    dstTrafficIndex(93, IANA_IPFIX_TYPES.unsigned32),
    applicationDescription(94, IANA_IPFIX_TYPES.string),
    applicationId(95, IANA_IPFIX_TYPES.octetArray),
    applicationName(96, IANA_IPFIX_TYPES.string),
    Assigned(97, IANA_IPFIX_TYPES.Netflow9),
    postIpDiffServCodePoint(98, IANA_IPFIX_TYPES.unsigned8),
    multicastReplicationFactor(99, IANA_IPFIX_TYPES.unsigned32),
    className(100, IANA_IPFIX_TYPES.string),
    classificationEngineId(101, IANA_IPFIX_TYPES.unsigned8),
    layer2packetSectionOffset(102, IANA_IPFIX_TYPES.unsigned16),
    layer2packetSectionSize(103, IANA_IPFIX_TYPES.unsigned16),
    layer2packetSectionData(104, IANA_IPFIX_TYPES.octetArray),
    bgpNextAdjacentAsNumber(128, IANA_IPFIX_TYPES.unsigned32),
    bgpPrevAdjacentAsNumber(129, IANA_IPFIX_TYPES.unsigned32),
    exporterIPv4Address(130, IANA_IPFIX_TYPES.ipv4Address),
    exporterIPv6Address(131, IANA_IPFIX_TYPES.ipv6Address),
    droppedOctetDeltaCount(132, IANA_IPFIX_TYPES.unsigned64),
    droppedPacketDeltaCount(133, IANA_IPFIX_TYPES.unsigned64),
    droppedOctetTotalCount(134, IANA_IPFIX_TYPES.unsigned64),
    droppedPacketTotalCount(135, IANA_IPFIX_TYPES.unsigned64),
    flowEndReason(136, IANA_IPFIX_TYPES.unsigned8),
    commonPropertiesId(137, IANA_IPFIX_TYPES.unsigned64),
    observationPointId(138, IANA_IPFIX_TYPES.unsigned64),
    icmpTypeCodeIPv6(139, IANA_IPFIX_TYPES.unsigned16),
    mplsTopLabelIPv6Address(140, IANA_IPFIX_TYPES.ipv6Address),
    lineCardId(141, IANA_IPFIX_TYPES.unsigned32),
    portId(142, IANA_IPFIX_TYPES.unsigned32),
    meteringProcessId(143, IANA_IPFIX_TYPES.unsigned32),
    exportingProcessId(144, IANA_IPFIX_TYPES.unsigned32),
    templateId(145, IANA_IPFIX_TYPES.unsigned16),
    wlanChannelId(146, IANA_IPFIX_TYPES.unsigned8),
    wlanSSID(147, IANA_IPFIX_TYPES.string),
    flowId(148, IANA_IPFIX_TYPES.unsigned64),
    observationDomainId(149, IANA_IPFIX_TYPES.unsigned32),
    flowStartSeconds(150, IANA_IPFIX_TYPES.dateTimeSeconds),
    flowEndSeconds(151, IANA_IPFIX_TYPES.dateTimeSeconds),
    flowStartMilliseconds(152, IANA_IPFIX_TYPES.dateTimeMilliseconds),
    flowEndMilliseconds(153, IANA_IPFIX_TYPES.dateTimeMilliseconds),
    flowStartMicroseconds(154, IANA_IPFIX_TYPES.dateTimeMicroseconds),
    flowEndMicroseconds(155, IANA_IPFIX_TYPES.dateTimeMicroseconds),
    flowStartNanoseconds(156, IANA_IPFIX_TYPES.dateTimeNanoseconds),
    flowEndNanoseconds(157, IANA_IPFIX_TYPES.dateTimeNanoseconds),
    flowStartDeltaMicroseconds(158, IANA_IPFIX_TYPES.unsigned32),
    flowEndDeltaMicroseconds(159, IANA_IPFIX_TYPES.unsigned32),
    systemInitTimeMilliseconds(160, IANA_IPFIX_TYPES.dateTimeMilliseconds),
    flowDurationMilliseconds(161, IANA_IPFIX_TYPES.unsigned32),
    flowDurationMicroseconds(162, IANA_IPFIX_TYPES.unsigned32),
    observedFlowTotalCount(163, IANA_IPFIX_TYPES.unsigned64),
    ignoredPacketTotalCount(164, IANA_IPFIX_TYPES.unsigned64),
    ignoredOctetTotalCount(165, IANA_IPFIX_TYPES.unsigned64),
    notSentFlowTotalCount(166, IANA_IPFIX_TYPES.unsigned64),
    notSentPacketTotalCount(167, IANA_IPFIX_TYPES.unsigned64),
    notSentOctetTotalCount(168, IANA_IPFIX_TYPES.unsigned64),
    destinationIPv6Prefix(169, IANA_IPFIX_TYPES.ipv6Address),
    sourceIPv6Prefix(170, IANA_IPFIX_TYPES.ipv6Address),
    postOctetTotalCount(171, IANA_IPFIX_TYPES.unsigned64),
    postPacketTotalCount(172, IANA_IPFIX_TYPES.unsigned64),
    flowKeyIndicator(173, IANA_IPFIX_TYPES.unsigned64),
    postMCastPacketTotalCount(174, IANA_IPFIX_TYPES.unsigned64),
    postMCastOctetTotalCount(175, IANA_IPFIX_TYPES.unsigned64),
    icmpTypeIPv4(176, IANA_IPFIX_TYPES.unsigned8),
    icmpCodeIPv4(177, IANA_IPFIX_TYPES.unsigned8),
    icmpTypeIPv6(178, IANA_IPFIX_TYPES.unsigned8),
    icmpCodeIPv6(179, IANA_IPFIX_TYPES.unsigned8),
    udpSourcePort(180, IANA_IPFIX_TYPES.unsigned16),
    udpDestinationPort(181, IANA_IPFIX_TYPES.unsigned16),
    tcpSourcePort(182, IANA_IPFIX_TYPES.unsigned16),
    tcpDestinationPort(183, IANA_IPFIX_TYPES.unsigned16),
    tcpSequenceNumber(184, IANA_IPFIX_TYPES.unsigned32),
    tcpAcknowledgementNumber(185, IANA_IPFIX_TYPES.unsigned32),
    tcpWindowSize(186, IANA_IPFIX_TYPES.unsigned16),
    tcpUrgentPointer(187, IANA_IPFIX_TYPES.unsigned16),
    tcpHeaderLength(188, IANA_IPFIX_TYPES.unsigned8),
    ipHeaderLength(189, IANA_IPFIX_TYPES.unsigned8),
    totalLengthIPv4(190, IANA_IPFIX_TYPES.unsigned16),
    payloadLengthIPv6(191, IANA_IPFIX_TYPES.unsigned16),
    ipTTL(192, IANA_IPFIX_TYPES.unsigned8),
    nextHeaderIPv6(193, IANA_IPFIX_TYPES.unsigned8),
    mplsPayloadLength(194, IANA_IPFIX_TYPES.unsigned32),
    ipDiffServCodePoint(195, IANA_IPFIX_TYPES.unsigned8),
    ipPrecedence(196, IANA_IPFIX_TYPES.unsigned8),
    fragmentFlags(197, IANA_IPFIX_TYPES.unsigned8),
    octetDeltaSumOfSquares(198, IANA_IPFIX_TYPES.unsigned64),
    octetTotalSumOfSquares(199, IANA_IPFIX_TYPES.unsigned64),
    mplsTopLabelTTL(200, IANA_IPFIX_TYPES.unsigned8),
    mplsLabelStackLength(201, IANA_IPFIX_TYPES.unsigned32),
    mplsLabelStackDepth(202, IANA_IPFIX_TYPES.unsigned32),
    mplsTopLabelExp(203, IANA_IPFIX_TYPES.unsigned8),
    ipPayloadLength(204, IANA_IPFIX_TYPES.unsigned32),
    udpMessageLength(205, IANA_IPFIX_TYPES.unsigned16),
    isMulticast(206, IANA_IPFIX_TYPES.unsigned8),
    ipv4IHL(207, IANA_IPFIX_TYPES.unsigned8),
    ipv4Options(208, IANA_IPFIX_TYPES.unsigned32),
    tcpOptions(209, IANA_IPFIX_TYPES.unsigned64),
    paddingOctets(210, IANA_IPFIX_TYPES.octetArray),
    collectorIPv4Address(211, IANA_IPFIX_TYPES.ipv4Address),
    collectorIPv6Address(212, IANA_IPFIX_TYPES.ipv6Address),
    exportInterface(213, IANA_IPFIX_TYPES.unsigned32),
    exportProtocolVersion(214, IANA_IPFIX_TYPES.unsigned8),
    exportTransportProtocol(215, IANA_IPFIX_TYPES.unsigned8),
    collectorTransportPort(216, IANA_IPFIX_TYPES.unsigned16),
    exporterTransportPort(217, IANA_IPFIX_TYPES.unsigned16),
    tcpSynTotalCount(218, IANA_IPFIX_TYPES.unsigned64),
    tcpFinTotalCount(219, IANA_IPFIX_TYPES.unsigned64),
    tcpRstTotalCount(220, IANA_IPFIX_TYPES.unsigned64),
    tcpPshTotalCount(221, IANA_IPFIX_TYPES.unsigned64),
    tcpAckTotalCount(222, IANA_IPFIX_TYPES.unsigned64),
    tcpUrgTotalCount(223, IANA_IPFIX_TYPES.unsigned64),
    ipTotalLength(224, IANA_IPFIX_TYPES.unsigned64),
    postNATSourceIPv4Address(225, IANA_IPFIX_TYPES.ipv4Address),
    postNATDestinationIPv4Address(226, IANA_IPFIX_TYPES.ipv4Address),
    postNAPTSourceTransportPort(227, IANA_IPFIX_TYPES.unsigned16),
    postNAPTDestinationTransportPort(228, IANA_IPFIX_TYPES.unsigned16),
    natOriginatingAddressRealm(229, IANA_IPFIX_TYPES.unsigned8),
    natEvent(230, IANA_IPFIX_TYPES.unsigned8),
    initiatorOctets(231, IANA_IPFIX_TYPES.unsigned64),
    responderOctets(232, IANA_IPFIX_TYPES.unsigned64),
    firewallEvent(233, IANA_IPFIX_TYPES.unsigned8),
    ingressVRFID(234, IANA_IPFIX_TYPES.unsigned32),
    egressVRFID(235, IANA_IPFIX_TYPES.unsigned32),
    VRFname(236, IANA_IPFIX_TYPES.string),
    postMplsTopLabelExp(237, IANA_IPFIX_TYPES.unsigned8),
    tcpWindowScale(238, IANA_IPFIX_TYPES.unsigned16),
    biflowDirection(239, IANA_IPFIX_TYPES.unsigned8),
    ethernetHeaderLength(240, IANA_IPFIX_TYPES.unsigned8),
    ethernetPayloadLength(241, IANA_IPFIX_TYPES.unsigned16),
    ethernetTotalLength(242, IANA_IPFIX_TYPES.unsigned16),
    dot1qVlanId(243, IANA_IPFIX_TYPES.unsigned16),
    dot1qPriority(244, IANA_IPFIX_TYPES.unsigned8),
    dot1qCustomerVlanId(245, IANA_IPFIX_TYPES.unsigned16),
    dot1qCustomerPriority(246, IANA_IPFIX_TYPES.unsigned8),
    metroEvcId(247, IANA_IPFIX_TYPES.string),
    metroEvcType(248, IANA_IPFIX_TYPES.unsigned8),
    pseudoWireId(249, IANA_IPFIX_TYPES.unsigned32),
    pseudoWireType(250, IANA_IPFIX_TYPES.unsigned16),
    pseudoWireControlWord(251, IANA_IPFIX_TYPES.unsigned32),
    ingressPhysicalInterface(252, IANA_IPFIX_TYPES.unsigned32),
    egressPhysicalInterface(253, IANA_IPFIX_TYPES.unsigned32),
    postDot1qVlanId(254, IANA_IPFIX_TYPES.unsigned16),
    postDot1qCustomerVlanId(255, IANA_IPFIX_TYPES.unsigned16),
    ethernetType(256, IANA_IPFIX_TYPES.unsigned16),
    postIpPrecedence(257, IANA_IPFIX_TYPES.unsigned8),
    collectionTimeMilliseconds(258, IANA_IPFIX_TYPES.dateTimeMilliseconds),
    exportSctpStreamId(259, IANA_IPFIX_TYPES.unsigned16),
    maxExportSeconds(260, IANA_IPFIX_TYPES.dateTimeSeconds),
    maxFlowEndSeconds(261, IANA_IPFIX_TYPES.dateTimeSeconds),
    messageMD5Checksum(262, IANA_IPFIX_TYPES.octetArray),
    messageScope(263, IANA_IPFIX_TYPES.unsigned8),
    minExportSeconds(264, IANA_IPFIX_TYPES.dateTimeSeconds),
    minFlowStartSeconds(265, IANA_IPFIX_TYPES.dateTimeSeconds),
    opaqueOctets(266, IANA_IPFIX_TYPES.octetArray),
    sessionScope(267, IANA_IPFIX_TYPES.unsigned8),
    maxFlowEndMicroseconds(268, IANA_IPFIX_TYPES.dateTimeMicroseconds),
    maxFlowEndMilliseconds(269, IANA_IPFIX_TYPES.dateTimeMilliseconds),
    maxFlowEndNanoseconds(270, IANA_IPFIX_TYPES.dateTimeNanoseconds),
    minFlowStartMicroseconds(271, IANA_IPFIX_TYPES.dateTimeMicroseconds),
    minFlowStartMilliseconds(272, IANA_IPFIX_TYPES.dateTimeMilliseconds),
    minFlowStartNanoseconds(273, IANA_IPFIX_TYPES.dateTimeNanoseconds),
    collectorCertificate(274, IANA_IPFIX_TYPES.octetArray),
    exporterCertificate(275, IANA_IPFIX_TYPES.octetArray),
    dataRecordsReliability(276, IANA_IPFIX_TYPES.BOOLEAN),
    observationPointType(277, IANA_IPFIX_TYPES.unsigned8),
    newConnectionDeltaCount(278, IANA_IPFIX_TYPES.unsigned32),
    connectionSumDurationSeconds(279, IANA_IPFIX_TYPES.unsigned64),
    connectionTransactionId(280, IANA_IPFIX_TYPES.unsigned64),
    postNATSourceIPv6Address(281, IANA_IPFIX_TYPES.ipv6Address),
    postNATDestinationIPv6Address(282, IANA_IPFIX_TYPES.ipv6Address),
    natPoolId(283, IANA_IPFIX_TYPES.unsigned32),
    natPoolName(284, IANA_IPFIX_TYPES.string),
    anonymizationFlags(285, IANA_IPFIX_TYPES.unsigned16),
    anonymizationTechnique(286, IANA_IPFIX_TYPES.unsigned16),
    informationElementIndex(287, IANA_IPFIX_TYPES.unsigned16),
    p2pTechnology(288, IANA_IPFIX_TYPES.string),
    tunnelTechnology(289, IANA_IPFIX_TYPES.string),
    encryptedTechnology(290, IANA_IPFIX_TYPES.string),
    basicList(291, IANA_IPFIX_TYPES.basicList),
    subTemplateList(292, IANA_IPFIX_TYPES.subTemplateList),
    subTemplateMultiList(293, IANA_IPFIX_TYPES.subTemplateMultiList),
    bgpValidityState(294, IANA_IPFIX_TYPES.unsigned8),
    IPSecSPI(295, IANA_IPFIX_TYPES.unsigned32),
    greKey(296, IANA_IPFIX_TYPES.unsigned32),
    natType(297, IANA_IPFIX_TYPES.unsigned8),
    initiatorPackets(298, IANA_IPFIX_TYPES.unsigned64),
    responderPackets(299, IANA_IPFIX_TYPES.unsigned64),
    observationDomainName(300, IANA_IPFIX_TYPES.string),
    selectionSequenceId(301, IANA_IPFIX_TYPES.unsigned64),
    selectorId(302, IANA_IPFIX_TYPES.unsigned64),
    informationElementId(303, IANA_IPFIX_TYPES.unsigned16),
    selectorAlgorithm(304, IANA_IPFIX_TYPES.unsigned16),
    samplingPacketInterval(305, IANA_IPFIX_TYPES.unsigned32),
    samplingPacketSpace(306, IANA_IPFIX_TYPES.unsigned32),
    samplingTimeInterval(307, IANA_IPFIX_TYPES.unsigned32),
    samplingTimeSpace(308, IANA_IPFIX_TYPES.unsigned32),
    samplingSize(309, IANA_IPFIX_TYPES.unsigned32),
    samplingPopulation(310, IANA_IPFIX_TYPES.unsigned32),
    samplingProbability(311, IANA_IPFIX_TYPES.float64),
    dataLinkFrameSize(312, IANA_IPFIX_TYPES.unsigned16),
    ipHeaderPacketSection(313, IANA_IPFIX_TYPES.octetArray),
    ipPayloadPacketSection(314, IANA_IPFIX_TYPES.octetArray),
    dataLinkFrameSection(315, IANA_IPFIX_TYPES.octetArray),
    mplsLabelStackSection(316, IANA_IPFIX_TYPES.octetArray),
    mplsPayloadPacketSection(317, IANA_IPFIX_TYPES.octetArray),
    selectorIdTotalPktsObserved(318, IANA_IPFIX_TYPES.unsigned64),
    selectorIdTotalPktsSelected(319, IANA_IPFIX_TYPES.unsigned64),
    absoluteError(320, IANA_IPFIX_TYPES.float64),
    relativeError(321, IANA_IPFIX_TYPES.float64),
    observationTimeSeconds(322, IANA_IPFIX_TYPES.dateTimeSeconds),
    observationTimeMilliseconds(323, IANA_IPFIX_TYPES.dateTimeMilliseconds),
    observationTimeMicroseconds(324, IANA_IPFIX_TYPES.dateTimeMicroseconds),
    observationTimeNanoseconds(325, IANA_IPFIX_TYPES.dateTimeNanoseconds),
    digestHashValue(326, IANA_IPFIX_TYPES.unsigned64),
    hashIPPayloadOffset(327, IANA_IPFIX_TYPES.unsigned64),
    hashIPPayloadSize(328, IANA_IPFIX_TYPES.unsigned64),
    hashOutputRangeMin(329, IANA_IPFIX_TYPES.unsigned64),
    hashOutputRangeMax(330, IANA_IPFIX_TYPES.unsigned64),
    hashSelectedRangeMin(331, IANA_IPFIX_TYPES.unsigned64),
    hashSelectedRangeMax(332, IANA_IPFIX_TYPES.unsigned64),
    hashDigestOutput(333, IANA_IPFIX_TYPES.BOOLEAN),
    hashInitialiserValue(334, IANA_IPFIX_TYPES.unsigned64),
    selectorName(335, IANA_IPFIX_TYPES.string),
    upperCILimit(336, IANA_IPFIX_TYPES.float64),
    lowerCILimit(337, IANA_IPFIX_TYPES.float64),
    confidenceLevel(338, IANA_IPFIX_TYPES.float64),
    informationElementDataType(339, IANA_IPFIX_TYPES.unsigned8),
    informationElementDescription(340, IANA_IPFIX_TYPES.string),
    informationElementName(341, IANA_IPFIX_TYPES.string),
    informationElementRangeBegin(342, IANA_IPFIX_TYPES.unsigned64),
    informationElementRangeEnd(343, IANA_IPFIX_TYPES.unsigned64),
    informationElementSemantics(344, IANA_IPFIX_TYPES.unsigned8),
    informationElementUnits(345, IANA_IPFIX_TYPES.unsigned16),
    privateEnterpriseNumber(346, IANA_IPFIX_TYPES.unsigned32),
    virtualStationInterfaceId(347, IANA_IPFIX_TYPES.octetArray),
    virtualStationInterfaceName(348, IANA_IPFIX_TYPES.string),
    virtualStationUUID(349, IANA_IPFIX_TYPES.octetArray),
    virtualStationName(350, IANA_IPFIX_TYPES.string),
    layer2SegmentId(351, IANA_IPFIX_TYPES.unsigned64),
    layer2OctetDeltaCount(352, IANA_IPFIX_TYPES.unsigned64),
    layer2OctetTotalCount(353, IANA_IPFIX_TYPES.unsigned64),
    ingressUnicastPacketTotalCount(354, IANA_IPFIX_TYPES.unsigned64),
    ingressMulticastPacketTotalCount(355, IANA_IPFIX_TYPES.unsigned64),
    ingressBroadcastPacketTotalCount(356, IANA_IPFIX_TYPES.unsigned64),
    egressUnicastPacketTotalCount(357, IANA_IPFIX_TYPES.unsigned64),
    egressBroadcastPacketTotalCount(358, IANA_IPFIX_TYPES.unsigned64),
    monitoringIntervalStartMilliSeconds(359, IANA_IPFIX_TYPES.dateTimeMilliseconds),
    monitoringIntervalEndMilliSeconds(360, IANA_IPFIX_TYPES.dateTimeMilliseconds),
    portRangeStart(361, IANA_IPFIX_TYPES.unsigned16),
    portRangeEnd(362, IANA_IPFIX_TYPES.unsigned16),
    portRangeStepSize(363, IANA_IPFIX_TYPES.unsigned16),
    portRangeNumPorts(364, IANA_IPFIX_TYPES.unsigned16),
    staMacAddress(365, IANA_IPFIX_TYPES.macAddress),
    staIPv4Address(366, IANA_IPFIX_TYPES.ipv4Address),
    wtpMacAddress(367, IANA_IPFIX_TYPES.macAddress),
    ingressInterfaceType(368, IANA_IPFIX_TYPES.unsigned32),
    egressInterfaceType(369, IANA_IPFIX_TYPES.unsigned32),
    rtpSequenceNumber(370, IANA_IPFIX_TYPES.unsigned16),
    userName(371, IANA_IPFIX_TYPES.string),
    applicationCategoryName(372, IANA_IPFIX_TYPES.string),
    applicationSubCategoryName(373, IANA_IPFIX_TYPES.string),
    applicationGroupName(374, IANA_IPFIX_TYPES.string),
    originalFlowsPresent(375, IANA_IPFIX_TYPES.unsigned64),
    originalFlowsInitiated(376, IANA_IPFIX_TYPES.unsigned64),
    originalFlowsCompleted(377, IANA_IPFIX_TYPES.unsigned64),
    distinctCountOfSourceIPAddress(378, IANA_IPFIX_TYPES.unsigned64),
    distinctCountOfDestinationIPAddress(379, IANA_IPFIX_TYPES.unsigned64),
    distinctCountOfSourceIPv4Address(380, IANA_IPFIX_TYPES.unsigned32),
    distinctCountOfDestinationIPv4Address(381, IANA_IPFIX_TYPES.unsigned32),
    distinctCountOfSourceIPv6Address(382, IANA_IPFIX_TYPES.unsigned64),
    distinctCountOfDestinationIPv6Address(383, IANA_IPFIX_TYPES.unsigned64),
    valueDistributionMethod(384, IANA_IPFIX_TYPES.unsigned8),
    rfc3550JitterMilliseconds(385, IANA_IPFIX_TYPES.unsigned32),
    rfc3550JitterMicroseconds(386, IANA_IPFIX_TYPES.unsigned32),
    rfc3550JitterNanoseconds(387, IANA_IPFIX_TYPES.unsigned32),
    dot1qDEI(388, IANA_IPFIX_TYPES.BOOLEAN),
    dot1qCustomerDEI(389, IANA_IPFIX_TYPES.BOOLEAN),
    flowSelectorAlgorithm(390, IANA_IPFIX_TYPES.unsigned16),
    flowSelectedOctetDeltaCount(391, IANA_IPFIX_TYPES.unsigned64),
    flowSelectedPacketDeltaCount(392, IANA_IPFIX_TYPES.unsigned64),
    flowSelectedFlowDeltaCount(393, IANA_IPFIX_TYPES.unsigned64),
    selectorIDTotalFlowsObserved(394, IANA_IPFIX_TYPES.unsigned64),
    selectorIDTotalFlowsSelected(395, IANA_IPFIX_TYPES.unsigned64),
    samplingFlowInterval(396, IANA_IPFIX_TYPES.unsigned64),
    samplingFlowSpacing(397, IANA_IPFIX_TYPES.unsigned64),
    flowSamplingTimeInterval(398, IANA_IPFIX_TYPES.unsigned64),
    flowSamplingTimeSpacing(399, IANA_IPFIX_TYPES.unsigned64),
    hashFlowDomain(400, IANA_IPFIX_TYPES.unsigned16),
    transportOctetDeltaCount(401, IANA_IPFIX_TYPES.unsigned64),
    transportPacketDeltaCount(402, IANA_IPFIX_TYPES.unsigned64),
    originalExporterIPv4Address(403, IANA_IPFIX_TYPES.ipv4Address),
    originalExporterIPv6Address(404, IANA_IPFIX_TYPES.ipv6Address),
    originalObservationDomainId(405, IANA_IPFIX_TYPES.unsigned32),
    intermediateProcessId(406, IANA_IPFIX_TYPES.unsigned32),
    ignoredDataRecordTotalCount(407, IANA_IPFIX_TYPES.unsigned64),
    dataLinkFrameType(408, IANA_IPFIX_TYPES.unsigned16),
    sectionOffset(409, IANA_IPFIX_TYPES.unsigned16),
    sectionExportedOctets(410, IANA_IPFIX_TYPES.unsigned16),
    dot1qServiceInstanceTag(411, IANA_IPFIX_TYPES.octetArray),
    dot1qServiceInstanceId(412, IANA_IPFIX_TYPES.unsigned32),
    dot1qServiceInstancePriority(413, IANA_IPFIX_TYPES.unsigned8),
    dot1qCustomerSourceMacAddress(414, IANA_IPFIX_TYPES.macAddress),
    dot1qCustomerDestinationMacAddress(415, IANA_IPFIX_TYPES.macAddress),
    postLayer2OctetDeltaCount(417, IANA_IPFIX_TYPES.unsigned64),
    postMCastLayer2OctetDeltaCount(418, IANA_IPFIX_TYPES.unsigned64),
    postLayer2OctetTotalCount(420, IANA_IPFIX_TYPES.unsigned64),
    postMCastLayer2OctetTotalCount(421, IANA_IPFIX_TYPES.unsigned64),
    minimumLayer2TotalLength(422, IANA_IPFIX_TYPES.unsigned64),
    maximumLayer2TotalLength(423, IANA_IPFIX_TYPES.unsigned64),
    droppedLayer2OctetDeltaCount(424, IANA_IPFIX_TYPES.unsigned64),
    droppedLayer2OctetTotalCount(425, IANA_IPFIX_TYPES.unsigned64),
    ignoredLayer2OctetTotalCount(426, IANA_IPFIX_TYPES.unsigned64),
    notSentLayer2OctetTotalCount(427, IANA_IPFIX_TYPES.unsigned64),
    layer2OctetDeltaSumOfSquares(428, IANA_IPFIX_TYPES.unsigned64),
    layer2OctetTotalSumOfSquares(429, IANA_IPFIX_TYPES.unsigned64),
    layer2FrameDeltaCount(430, IANA_IPFIX_TYPES.unsigned64),
    layer2FrameTotalCount(431, IANA_IPFIX_TYPES.unsigned64),
    pseudoWireDestinationIPv4Address(432, IANA_IPFIX_TYPES.ipv4Address),
    ignoredLayer2FrameTotalCount(433, IANA_IPFIX_TYPES.unsigned64),
    mibObjectValueInteger(434, IANA_IPFIX_TYPES.signed32),
    mibObjectValueOctetString(435, IANA_IPFIX_TYPES.octetArray),
    mibObjectValueOID(436, IANA_IPFIX_TYPES.octetArray),
    mibObjectValueBits(437, IANA_IPFIX_TYPES.octetArray),
    mibObjectValueIPAddress(438, IANA_IPFIX_TYPES.ipv4Address),
    mibObjectValueCounter(439, IANA_IPFIX_TYPES.unsigned64),
    mibObjectValueGauge(440, IANA_IPFIX_TYPES.unsigned32),
    mibObjectValueTimeTicks(441, IANA_IPFIX_TYPES.unsigned32),
    mibObjectValueUnsigned(442, IANA_IPFIX_TYPES.unsigned32),
    mibObjectValueTable(443, IANA_IPFIX_TYPES.subTemplateList),
    mibObjectValueRow(444, IANA_IPFIX_TYPES.subTemplateList),
    mibObjectIdentifier(445, IANA_IPFIX_TYPES.octetArray),
    mibSubIdentifier(446, IANA_IPFIX_TYPES.unsigned32),
    mibIndexIndicator(447, IANA_IPFIX_TYPES.unsigned64),
    mibCaptureTimeSemantics(448, IANA_IPFIX_TYPES.unsigned8),
    mibContextEngineID(449, IANA_IPFIX_TYPES.octetArray),
    mibContextName(450, IANA_IPFIX_TYPES.string),
    mibObjectName(451, IANA_IPFIX_TYPES.string),
    mibObjectDescription(452, IANA_IPFIX_TYPES.string),
    mibObjectSyntax(453, IANA_IPFIX_TYPES.string),
    mibModuleName(454, IANA_IPFIX_TYPES.string),
    mobileIMSI(455, IANA_IPFIX_TYPES.string),
    mobileMSISDN(456, IANA_IPFIX_TYPES.string),
    httpStatusCode(457, IANA_IPFIX_TYPES.unsigned16),
    sourceTransportPortsLimit(458, IANA_IPFIX_TYPES.unsigned16),
    httpRequestMethod(459, IANA_IPFIX_TYPES.string),
    httpRequestHost(460, IANA_IPFIX_TYPES.string),
    httpRequestTarget(461, IANA_IPFIX_TYPES.string),
    httpMessageVersion(462, IANA_IPFIX_TYPES.string),
    natInstanceID(463, IANA_IPFIX_TYPES.unsigned32),
    internalAddressRealm(464, IANA_IPFIX_TYPES.octetArray),
    externalAddressRealm(465, IANA_IPFIX_TYPES.octetArray),
    natQuotaExceededEvent(466, IANA_IPFIX_TYPES.unsigned32),
    natThresholdEvent(467, IANA_IPFIX_TYPES.unsigned32),
    httpUserAgent(468, IANA_IPFIX_TYPES.string),
    httpContentType(469, IANA_IPFIX_TYPES.string),
    httpReasonPhrase(470, IANA_IPFIX_TYPES.string),
    maxSessionEntries(471, IANA_IPFIX_TYPES.unsigned32),
    maxBIBEntries(472, IANA_IPFIX_TYPES.unsigned32),
    maxEntriesPerUser(473, IANA_IPFIX_TYPES.unsigned32),
    maxSubscribers(474, IANA_IPFIX_TYPES.unsigned32),
    maxFragmentsPendingReassembly(475, IANA_IPFIX_TYPES.unsigned32),
    addressPoolHighThreshold(476, IANA_IPFIX_TYPES.unsigned32),
    addressPoolLowThreshold(477, IANA_IPFIX_TYPES.unsigned32),
    addressPortMappingHighThreshold(478, IANA_IPFIX_TYPES.unsigned32),
    addressPortMappingLowThreshold(479, IANA_IPFIX_TYPES.unsigned32),
    addressPortMappingPerUserHighThreshold(480, IANA_IPFIX_TYPES.unsigned32),
    globalAddressMappingHighThreshold(481, IANA_IPFIX_TYPES.unsigned32);

    private IANA_IPFIX(final int ianaCode, final IANA_IPFIX_TYPES type) {
        this.ianaCode = ianaCode;
        this.type = type;
    }

    private static final Map<Integer, IANA_IPFIX> index = new HashMap<>();

    static {
        for (final IANA_IPFIX v : IANA_IPFIX.values()) {
            index.put(v.getIanaCode(), v);
        }
    }

    static IANA_IPFIX fromCode(final int code) {
        if (index.containsKey(code)) {
            return index.get(code);
        }
        return IANA_IPFIX.customField;
    }

    public IANA_IPFIX_TYPES getType() {
        return type;
    }

    public int getIanaCode() {
        return ianaCode;
    }

    private final int ianaCode;
    private IANA_IPFIX_TYPES type;
}
