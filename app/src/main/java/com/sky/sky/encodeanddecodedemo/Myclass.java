package com.sky.sky.encodeanddecodedemo;

import java.util.List;

/**
 * Created by Administrator on 2017/2/27.
 */

public class Myclass {

    /**
     * code : 200
     * hasmore : true
     * page_total : 8
     * datas : {"article_list":[{"article_title":"最适合在","article_id":"1181","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/27/f5a1da68967fd70a","article_publish_time":"1488162512","article_abstract":"把春天的气息埋进肚子里","article_origin":"","top":"0","video_length":""},{"article_title":"100个问题，问一钵咖喱","article_id":"1178","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/23/bda7d2b0e8332093","article_publish_time":"1487815675","article_abstract":"明日的面包还是抵不过昨夜的咖喱。","article_origin":"","top":"0","video_length":""},{"article_title":"那些在银幕里出现过的著名食物","article_id":"1173","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/20/0e800358c9efca2d","article_publish_time":"1487559600","article_abstract":"看看这些经典的电视、电影中出现过哪些标志食物","article_origin":"","top":"0","video_length":""},{"article_title":"如何一次性解决吃海鲜痛点","article_id":"1169","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/16/bb4f88887a3e11c6","article_publish_time":"1487216808","article_abstract":"小能手方法大全","article_origin":"","top":"0","video_length":""},{"article_title":"冰淇淋能有哪些味道？","article_id":"1159","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/13/850027292df34671","article_publish_time":"1486948326","article_abstract":"你还吃过些什么独特口味的冰淇淋呢？","article_origin":"","top":"0","video_length":""},{"article_title":"9种食物拼贴新玩法","article_id":"1156","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/09/b8f9390d409148fe","article_publish_time":"1486613741","article_abstract":"一本正经地有趣","article_origin":"","top":"0","video_length":""},{"article_title":"快把这20个有趣的食物冷知识上交给国家","article_id":"1151","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/26/c23b9734c8b29390","article_publish_time":"1485401439","article_abstract":"食物只能用来吃吗？","article_origin":"","top":"0","video_length":""},{"article_title":"食材生存秘笈","article_id":"1146","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/23/4a9cc822326391b0","article_publish_time":"1485139722","article_abstract":"食材们，都有自己生存法则！","article_origin":"","top":"0","video_length":""},{"article_title":"关于面包，你应该知道的事","article_id":"1142","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/19/7b14430dbadba433","article_publish_time":"1484819946","article_abstract":"有些问题，在发生之前都不会被认为是问题。","article_origin":"","top":"0","video_length":""},{"article_title":"不知道吃什么的时候，就点个披萨吧","article_id":"1136","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/16/cf7c30595a2b2304","article_publish_time":"1484536928","article_abstract":"从北欧到意大利再到美国，总有一种全新的披萨又出现在前方。","article_origin":"","top":"0","video_length":""}],"qa":"Q&A"}
     */

    private int code;
    private boolean hasmore;
    private int page_total;
    private DatasBean datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isHasmore() {
        return hasmore;
    }

    public void setHasmore(boolean hasmore) {
        this.hasmore = hasmore;
    }

    public int getPage_total() {
        return page_total;
    }

    public void setPage_total(int page_total) {
        this.page_total = page_total;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * article_list : [{"article_title":"最适合在春天喝的7款鸡尾酒","article_id":"1181","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/27/f5a1da68967fd70a","article_publish_time":"1488162512","article_abstract":"把春天的气息埋进肚子里","article_origin":"","top":"0","video_length":""},{"article_title":"100个问题，问一钵咖喱","article_id":"1178","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/23/bda7d2b0e8332093","article_publish_time":"1487815675","article_abstract":"明日的面包还是抵不过昨夜的咖喱。","article_origin":"","top":"0","video_length":""},{"article_title":"那些在银幕里出现过的著名食物","article_id":"1173","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/20/0e800358c9efca2d","article_publish_time":"1487559600","article_abstract":"看看这些经典的电视、电影中出现过哪些标志食物","article_origin":"","top":"0","video_length":""},{"article_title":"如何一次性解决吃海鲜痛点","article_id":"1169","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/16/bb4f88887a3e11c6","article_publish_time":"1487216808","article_abstract":"小能手方法大全","article_origin":"","top":"0","video_length":""},{"article_title":"冰淇淋能有哪些味道？","article_id":"1159","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/13/850027292df34671","article_publish_time":"1486948326","article_abstract":"你还吃过些什么独特口味的冰淇淋呢？","article_origin":"","top":"0","video_length":""},{"article_title":"9种食物拼贴新玩法","article_id":"1156","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/02/09/b8f9390d409148fe","article_publish_time":"1486613741","article_abstract":"一本正经地有趣","article_origin":"","top":"0","video_length":""},{"article_title":"快把这20个有趣的食物冷知识上交给国家","article_id":"1151","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/26/c23b9734c8b29390","article_publish_time":"1485401439","article_abstract":"食物只能用来吃吗？","article_origin":"","top":"0","video_length":""},{"article_title":"食材生存秘笈","article_id":"1146","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/23/4a9cc822326391b0","article_publish_time":"1485139722","article_abstract":"食材们，都有自己生存法则！","article_origin":"","top":"0","video_length":""},{"article_title":"关于面包，你应该知道的事","article_id":"1142","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/19/7b14430dbadba433","article_publish_time":"1484819946","article_abstract":"有些问题，在发生之前都不会被认为是问题。","article_origin":"","top":"0","video_length":""},{"article_title":"不知道吃什么的时候，就点个披萨吧","article_id":"1136","article_video":"","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/16/cf7c30595a2b2304","article_publish_time":"1484536928","article_abstract":"从北欧到意大利再到美国，总有一种全新的披萨又出现在前方。","article_origin":"","top":"0","video_length":""}]
         * qa : Q&A
         */

        private String qa;
        private List<ArticleListBean> article_list;

        public String getQa() {
            return qa;
        }

        public void setQa(String qa) {
            this.qa = qa;
        }

        public List<ArticleListBean> getArticle_list() {
            return article_list;
        }

        public void setArticle_list(List<ArticleListBean> article_list) {
            this.article_list = article_list;
        }

        public static class ArticleListBean {
            /**
             * article_title : 最适合在春天喝的7款鸡尾酒
             * article_id : 1181
             * article_video :
             * article_image : http://yueshi.b0.upaiyun.com/cms/2017/02/27/f5a1da68967fd70a
             * article_publish_time : 1488162512
             * article_abstract : 把春天的气息埋进肚子里
             * article_origin :
             * top : 0
             * video_length :
             */

            private String article_title;
            private String article_id;
            private String article_video;
            private String article_image;
            private String article_publish_time;
            private String article_abstract;
            private String article_origin;
            private String top;
            private String video_length;

            public String getArticle_title() {
                return article_title;
            }

            public void setArticle_title(String article_title) {
                this.article_title = article_title;
            }

            public String getArticle_id() {
                return article_id;
            }

            public void setArticle_id(String article_id) {
                this.article_id = article_id;
            }

            public String getArticle_video() {
                return article_video;
            }

            public void setArticle_video(String article_video) {
                this.article_video = article_video;
            }

            public String getArticle_image() {
                return article_image;
            }

            public void setArticle_image(String article_image) {
                this.article_image = article_image;
            }

            public String getArticle_publish_time() {
                return article_publish_time;
            }

            public void setArticle_publish_time(String article_publish_time) {
                this.article_publish_time = article_publish_time;
            }

            public String getArticle_abstract() {
                return article_abstract;
            }

            public void setArticle_abstract(String article_abstract) {
                this.article_abstract = article_abstract;
            }

            public String getArticle_origin() {
                return article_origin;
            }

            public void setArticle_origin(String article_origin) {
                this.article_origin = article_origin;
            }

            public String getTop() {
                return top;
            }

            public void setTop(String top) {
                this.top = top;
            }

            public String getVideo_length() {
                return video_length;
            }

            public void setVideo_length(String video_length) {
                this.video_length = video_length;
            }
        }
    }
}
