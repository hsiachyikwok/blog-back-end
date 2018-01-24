/*
 Navicat Premium Data Transfer

 Source Server         : aliyun@me
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : 47.52.24.159:3306
 Source Schema         : myblog

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 24/01/2018 14:20:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for archive
-- ----------------------------
DROP TABLE IF EXISTS `archive`;
CREATE TABLE `archive` (
  `id` char(8) NOT NULL,
  `archive_time` datetime DEFAULT NULL,
  `article_count` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` char(8) NOT NULL,
  `article_title` varchar(50) DEFAULT NULL,
  `article_link` varchar(100) DEFAULT NULL,
  `picture` varchar(100) DEFAULT NULL,
  `content` text,
  `is_top` char(1) DEFAULT NULL,
  `tag_name` varchar(50) DEFAULT NULL,
  `type` char(1) DEFAULT NULL,
  `allow_comment` char(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `comment_count` int(11) DEFAULT NULL,
  `view_count` int(11) DEFAULT NULL,
  `is_del` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` char(8) NOT NULL,
  `cat_name` varchar(50) DEFAULT NULL,
  `cat_desc` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for category_article_ref
-- ----------------------------
DROP TABLE IF EXISTS `category_article_ref`;
CREATE TABLE `category_article_ref` (
  `id` char(8) NOT NULL,
  `article_id` char(8) DEFAULT NULL,
  `category_id` char(8) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` char(8) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `avatar` varchar(100) DEFAULT NULL,
  `blog_title` varchar(50) DEFAULT NULL,
  `blog_sub_title` varchar(50) DEFAULT NULL,
  `blog_logo` varchar(100) DEFAULT NULL,
  `favicon` varchar(100) DEFAULT NULL,
  `meta_keywords` varchar(255) DEFAULT NULL,
  `meta_desc` varchar(255) DEFAULT NULL,
  `footer` varchar(255) DEFAULT NULL,
  `notice` varchar(255) DEFAULT NULL,
  `allow_comment` char(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `list_style` char(1) DEFAULT NULL,
  `recent_comment_size` int(11) DEFAULT NULL,
  `page_size` int(11) DEFAULT NULL,
  `page_width` int(11) DEFAULT NULL,
  `most_view_size` int(11) DEFAULT NULL,
  `most_comment_size` int(11) DEFAULT NULL,
  `used_tag_size` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for friend_link
-- ----------------------------
DROP TABLE IF EXISTS `friend_link`;
CREATE TABLE `friend_link` (
  `id` char(8) NOT NULL,
  `link_title` varchar(50) DEFAULT NULL,
  `link` varchar(100) DEFAULT NULL,
  `order` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for navigation
-- ----------------------------
DROP TABLE IF EXISTS `navigation`;
CREATE TABLE `navigation` (
  `id` char(8) NOT NULL,
  `nav_name` varchar(50) DEFAULT NULL,
  `link` varchar(100) DEFAULT NULL,
  `order` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `icon` varchar(100) DEFAULT NULL,
  `blank` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for signature
-- ----------------------------
DROP TABLE IF EXISTS `signature`;
CREATE TABLE `signature` (
  `id` char(8) NOT NULL,
  `content` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `id` char(8) NOT NULL,
  `tag_name` varchar(50) DEFAULT NULL,
  `tag_desc` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
