# 0. ubuntu:22.04をベースにする
FROM ubuntu:22.04

# 1. command_tutorialディレクトリーをルートディレクトリに作成して
#	そのなかにfirstvi.txtを作成
RUN mkdir /command_tutorial
RUN touch /command_tutorial/firstvi.txt

# 2. viのインストール
RUN apt update
RUN apt -y install vim

# 3. ubuntuの日本語対応
RUN apt -y install language-pack-ja
RUN update-locale LANG=ja_JP.utf8
ENV LANG ja_JP.utf8

# 4. 日本時間(JST)の設定
RUN DEBIAN_FRONTEND=noninteracive apt -y install tzdata
RUN echo 'Asia/Tokyo' > /etc/timezone
ENV TZ Asia/Tokyo